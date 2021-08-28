package Level2;

// 2021.08.28
class FindLeastCommonMultiple {

	// Euclidean algorithm (유클리드 알고리즘)
	// 기원전 300년경에 발견된 가장 오래된 알고리즘
	// reference : https://velog.io/@yerin4847/W1-유클리드-호제법
	// [logic]
	// a > b, r = a % b => gcd(a, b) = gcd(b, r)
	// if r = 0, b = gcd

	public int solution(int[] arr) {
		int answer = arr[0];

		for (int i = 1; i < arr.length; i++) {
			int gcd = gcd(answer, arr[i]); // GCD(Greatest Common Divisor)
			answer = answer * arr[i] / gcd; // LCM(Least Common Multiple)
		}

		return answer;
	}

	public static int gcd(int a, int b) {
		int x = Math.max(a, b);
		int y = Math.min(a, b);

		while (x % y != 0) {
			int r = x % y;
			x = y;
			y = r;
		} // if r == 0, y is gcd

		return y;
	}
}
