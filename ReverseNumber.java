package Level1;
import java.lang.Long;
import java.util.ArrayList;

class ReverseNumber {
    
    /**
    * How to solve
    * 1. get each digits and add to array
    * 2. reverse order
    **/
    public int[] solution(long n) {
    	
        int[] answer = {}; // default
        ArrayList<Integer> answerList = new ArrayList<>();
        
        while (n > 0) {
            Long remainder = n % 10;
            answerList.add(remainder.intValue());
            n = n / 10;
        }
        
        answer = new int[answerList.size()];
        
        int i = 0;
        for (Integer num : answerList) answer[i++] = num;

        return answer;
    }
    
    /**
     * [ The better answer]
     *
     	String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt = 0;

        while (n>0) {
            answer[cnt] = (int) (n%10);
            n /= 10;
            cnt++;
        }
      	return answer;
     *
     */
}