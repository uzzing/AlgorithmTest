package Level1;

class FindSpecificString {

	/**
	 * find "Kim" in the array 'seoul'
	 **/
	public String solution(String[] seoul) {
		String answer = "";

		int index = 0;
		int i = 0;
		for (String name : seoul) {
			if (name.equals("Kim")) index = i;
			else i++;
		}

		answer += "김서방은 " + index + "에 있다";
		return answer;
	}
}
