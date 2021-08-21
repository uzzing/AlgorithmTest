package Level1;

import java.util.List;
import java.util.Arrays;

class CountSpecificAlphabets {
	boolean solution(String s) {
		boolean answer = true;

		int yCount = 0;
		int pCount = 0;

		List<String> list = Arrays.asList(s.split(""));

		for (String str : list) {
			if (str.toUpperCase().equals("Y")) yCount++;
			else if (str.toUpperCase().equals("P")) pCount++;
		}


		if (pCount != yCount) answer = false;
		else answer = true;

		return answer;
	}
	
	/**
	 * [ the better answer ]
	 	boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() 
        		== s.chars().filter( e -> 'Y'== e).count();
    	}
	 */
}
