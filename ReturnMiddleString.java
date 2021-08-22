package Level1;

// 2021.08.22 
class ReturnMiddleString {

	/**
	 * 1. Get the length of String 
	 * 2. Divide the length with 2 
	 * 3. If remainder is not 0 (I mean it's odd number), return s.charAt(a)
	 * 4. If not (I mean it's even), return s.substring(a, a+1)
	 **/
	public String solution(String s) {
		String answer = "";

		int len = s.length();

		if (len % 2 != 0)
			answer += s.charAt(len / 2); // odd
		else
			answer += s.substring(len / 2 - 1, len / 2 + 1); // even

		return answer;
	}
}

/**
 * [ The better answer ]
 * 
 * 	return s.substring((s.length() - 1) / 2, (s.length() / 2) + 1);
 **/
