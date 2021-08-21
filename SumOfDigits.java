package Level1;
import java.util.*;

public class SumOfDigits {
    
    /**
    * How to solve this
    * 1. get each digits of n -> use division
    * 2. add to arraylist
    * 3. get value of sum of arraylist
    **/
    public int solution(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        
        while (n > 0) {
            list.add(n % 10);
            n = n / 10;
        }
        
        int sum = 0;
        for (Integer num : list) sum += num;

        return sum;
    }
    
    /**
     * [ The better answer ]
     * 
		int answer = 0;

        while (true) {
            answer += n%10;
            if (n < 10) break;
            n = n/10;
        }
        
        return answer;
     *
     */
}