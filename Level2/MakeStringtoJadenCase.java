package Level2;

// 2021.08.28
class MakeStringtoJadenCase {

	/**
	 * 1. Split by "" and add to array 
	 * 2. Save char upper at the first time and after spacing 
	 **/
	public String solution(String s) {
		
		String answer = "";
		String[] array = s.toLowerCase().split(""); // save one character by one
		boolean flag = true;

		for (String str : array) {
			answer += flag ? str.toUpperCase() : str;
			flag = str.equals(" ") ? true : false;
		}

		return answer;
	}
}
