package Level1;

import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Integer;

// 2021.08.22 
class DivideNumberAndFindAnyWIthZeroRemaining {
	/**
	 * 1. Divide each index of arr by divisor and find index with zero remaining 
	 * 2. Sort arr in ascending order
	 **/
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};

		// 1.
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) list.add(arr[i]);
		}
		

		// 2.
		if (list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		}
		else {
			answer = new int[list.size()];
			answer = list.stream().mapToInt(Integer::intValue).toArray();
			Arrays.sort(answer);
		}

		return answer;
	}
}

/**
 * 
 * [ The better code ]
	int[] answer = Arrays.stream(arr)
					.filter(index -> index % divisor == 0).toArray();
	Arrays.sort(answer);
	
	if (answer.length == 0) {
		answer = new int[1];
        answer[0] = -1;
   	}
   	
   	return answer;
 * 
 **/
