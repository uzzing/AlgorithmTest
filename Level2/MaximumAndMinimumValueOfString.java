package Level2;


// 2021.08.29
class MaximumAndMinimumValueOfString {
	
	public String solution(String s) {
		
		String answer = "";

		String[] arr = s.split(" ");

		int min = Integer.parseInt(arr[0]);
		int max = Integer.parseInt(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			int num = Integer.parseInt(arr[i]);
			if (max < num) max = num;
			else if (min > num) min = num;
		}

		answer += min + " " + max;
		return answer;
	}
}
