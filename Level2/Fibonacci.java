package Level2;

class Fibonacci {
	
    public int solution(int n) {
    	
        int left = 0; // f0
        int right = 1; // f1
        int answer = 0;

        for (int i = 2; i <= n; i++) { // f2 ~ n
            answer = (left + right) % 1234567;
            left = right;
            right = answer;
        }

        return answer;
    }
}
// 0 1 1 2 3 5 8 13 21 34,,,

