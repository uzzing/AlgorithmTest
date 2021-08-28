package Level1;

import java.lang.Math;

class SumOfDivisors {

	/**
	 * How to resolve this
	 * 
	 * 1. get divisor of n by using division
	 * 2. get sum of divisors
	 **/
	public int solution(int n) {

		int sum = 0;
		for (int num = 1; num <= Math.sqrt(n); num++) {
			// find the digits which make remainder 0
			if (n % num == 0) {
				sum += num;
				sum += n / num;
				if (num == Math.sqrt(n))
					sum -= num;
			}
		}

		return sum;
	}
}
