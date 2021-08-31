package Level2;

// 2021.08.31
class DecimalNumToBinaryNum {

	/*
    Decimal number - > Binary number(combined with 0 and 1)
    1. Get count of 1 of n
        -> divide with 2 repeatly and if the remainder is 1, count++
    2. Find the next number that count of 1 is same with 1
    */
	public int solution(int n) {
		int answer = 0;

		int count = countOf1(n);

		for (int num = n + 1;; num++) {
			int newCount = countOf1(num);
			if (count == newCount) {
				answer = num;
				break;
			}
		}

		return answer;
	}

	public int countOf1(int n) {

		int count = 0;
		String binary = Integer.toBinaryString(n);

		for (char c : binary.toCharArray())
			if (c == '1')
				count++;

		return count;
	}
}

/*

2 78
2 39 0
2 19 1
2 9  1
2 4  1
2 2  0
  1  0
78's  binary number : 1001110

*/
