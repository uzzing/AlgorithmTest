package Level1;

// 2021.08.22
class SumBetweenTwoIntegers {
	public long solution(int a, int b) {
		
		long answer = 0;

		if (a > b) {
			for (int i = b; i <= a; i++) answer += i;
		} 
		else if (a < b) {
			for (int i = a; i <= b; i++) answer += i;
		} 
		else answer = a;

		return answer;
	}
}

/**
 * [ the better answer ]
 * 
  	public long solution(int a, int b) {
      long answer = 0;

      for(int i = Math.min(a,b); i <= Math.max(a,b); i++) {
              answer += i;
      }

      return answer;
  }
 **/

