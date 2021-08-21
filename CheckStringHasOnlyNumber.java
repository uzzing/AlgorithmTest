package Level1;

import java.lang.String;

class CheckStringHasOnlyNumber {
	/**
	 * 1. Check length : 4 < len < 6 
	 * 2. Check s has only number
	 **/
	public boolean solution(String s) {
		boolean answer = true;

		// 1.
		answer = s.length() == 4 ? true : s.length() == 6 ? true : false;

		// 2.
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c < '0' || c > '9')
				answer = false;
		}

		return answer;
	}
}
