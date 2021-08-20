import java.util.ArrayList;

class FindPrimaryNumber {
    
	// the number of prime
    static int answer = 0;
    
    // check whether you have already checked each index
    static boolean[] check = new boolean[7];
    
    // new array to store new numbers
    static ArrayList<Integer> arr = new ArrayList<>();
    
    
    public int solution(String numbers) { 

        String temp="";
        
        for (int i = 1; i <= numbers.length(); i++) {
            rec(numbers, temp, i);
        }
        
        for (int x : arr) {  
            checkPrimary(x);
        }
        
        return answer;
    }
    
    // make new numbers and add arraylist
    public static void rec (String n, String temp, int length) {
    	
        // 11. if all making numbers is done, exit method
        if (temp.length() == length) {
        	
            // 12. check whether there is a duplicate value in the arraylist
            if (!arr.contains(Integer.parseInt(temp))) arr.add(Integer.parseInt(temp));              
            return;
        }
        
        // 4. make new numbers
        for (int j = 0; j < n.length(); j++) {
        	
            // 5. if the value is already checked, skip (it means it's value is true)
            if (check[j]) continue;
            
            // 6. make new number
            temp += n.charAt(j);
            
            // 7. mark that you already checked the value
            check[j] = true;
            
            // 8. revoke own method for making new numbers and adding the number to arraylist
            rec(n, temp, length);
            
            // 9. after adding the number, 
            // 		mark that you already added the value and don't need it anymore
            check[j] = false;
            
            // 10. except for the last char, get the remained number
            temp = temp.substring(0,temp.length()-1);

        }                      
    }
    
    // check whether the number is a primary number
    public static void checkPrimary(int n) {
    	
        // 16. if number is 0, 1, it's not primary number
        if (n == 0) return;
        if (n == 1) return;
        
        // 17. check the remaining value if it is divided from 2 to sqrt n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return;
        }
        
        // 18. increase the number of primary number
        answer++;
            
    }
}