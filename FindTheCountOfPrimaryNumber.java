package Level1;

class FindTheCountOfPrimaryNumber {
	/**
	 * How to find the primary number
	 * "Sieve of Eratosthenes"
	 **/
	public int solution(int n) {

		int answer = 0;

		// 1. fill numbers in array
		// 		Q: Why didn't I include 1?
		// 		A : Because 1 is not a primary number
		int[] numbers = new int[n + 1];
		for (int i = 2; i <= n; i++)
			numbers[i] = i;

		// 2. find primary number from 2 to 10 (2, 3, 5, 7)
		for (int i = 2; i <= n; i++) { // 2 ~ n

			// if it's already 0, skip
			if (numbers[i] == 0) continue;

			// 2-1. make the multiple of those primary numbers meaningless like 0 
			for (int j = 2 * i; j <= n; j += i) numbers[j] = 0;
		}

		// 3. get all index from array except for 0
		for (int num : numbers) {
			if (num != 0) answer++;
		}

		return answer;
	}
}
