package Level1;

class AsciiCode {

	/**
	 * How to solve this 
	 * 
	 * use acscii code (the total count of A~Z or a~z : 26) 
	 * 
	 * condition : 1. uppercase / 2. lowercase / 3. space 
	 * 
	 * 1. if it's uppercase -> but if it's over 'Z', minus 26 
	 * 2. if it's lowercase -> but if it's over 'z', minus 26 
	 * 3. if it's only space -> skip loop
	 * 
	 **/

	public String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			char newC = (char) ((int) c + n);

			// if it's only space
			if (c == ' ') {
				answer += ' ';
				continue;
			}

			if (c >= 'A' && c <= 'Z') { // if it's upper case
				if (newC > 'Z')
					answer += (char) (newC - 26);
				else
					answer += (char) newC;
			} else if (c >= 'a' && c <= 'z') { // if it's lower case
				if (newC > 'z')
					answer += (char) (newC - 26);
				else
					answer += (char) newC;
			}

		}

		return answer;
	}
}
