package Level1;

import java.util.List;
import java.util.Arrays;

class MakeSentenceMixedUpperCaseAndLowerCase {
	/**
	 * How to solve this 
	 * 
	 * 1. Split String by "" and make array
	 * 2. Check whether each char is even and odd 
	 * 		2-1. When char is " ", don't check
	 * 		2-2. Make them upper or lower
	 * 3. Make list to String
	 * 
	 **/
	public String solution(String s) {

		// 1. Split String by "" and make array
		List<String> list = Arrays.asList(s.split(""));

		// 2. Check whether each char is even and odd
		int count = 0;
		int index = -1;
		for (String letter : list) {
			index++;

			// 2-1. when char is " ", don't check
			if (letter.equals(" ")) {
				count = 0;
				list.set(index, " ");
				continue;
			}

			// 2-2. Make them upper or lower
			if (count % 2 == 0) list.set(index, letter.toUpperCase());
			else list.set(index, letter.toLowerCase());
			count++;

		}

		// 3. Make list to String
		StringBuilder stringBuilder = new StringBuilder();
		for (String item : list) {
			stringBuilder.append(item);
		}

		String answer = stringBuilder.toString();

		return answer;
	}
	
	/**
	 * [ The better answer ]
	 * 
	 	String answer = "";
	 	int cnt = 0;
	 	String[] array = s.split("");
	 	for (String ss : array) {
	  		cnt = ss.contains(" ") ? 0 : cnt + 1;
	  		answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
	 	}
	 	return answer;
	 * 
	 */
}
