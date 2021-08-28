package Level1;

// 2021.08.22 
class WhatDayIsItIn2016 {
	
	public String solution(int a, int b) {
		
		int month = a;
		int totalDay = b;

		String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		for (int i = 1; i < month; i++) {
			if (i == 4 || i == 6 || i == 9 || i == 11)
				totalDay += 30;
			else if (i == 2)
				totalDay += 29;
			else
				totalDay += 31;
		}

		totalDay += 4; // because 2016/1/1 was friday (count days since monday)
		
		String answer = day[totalDay % 7];

		return answer;
	}
}
