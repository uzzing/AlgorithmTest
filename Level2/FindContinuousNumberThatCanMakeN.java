package Level2;

// 2021.08.29
class FindContinuousNumberThatCanMakeN {

	// 1. check from 1 to x
	// 2. after 1, check from 2 to x -> repeat
	// The common way how to check
	// 1. plus continuously
	// 2. if sum has exceeded n, go to next loop (continue)
	
	public int solution(int n) {
		int answer = 0;

		int sum = 0;
		for (int start = 1; start <= n; start++) {
			for (int i = start; i <= n; i++) {
				int newSum = sum + i;
				if (newSum < n) sum = newSum;
				else if (newSum > n) break;
				else { // newSum == n
					answer++;
					break;
				}
			}
			sum = 0;
		}

		return answer;
	}
}
