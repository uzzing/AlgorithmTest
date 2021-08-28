package Level1;

import java.util.*;

// 2021.08.22 
public class RemoveDuplicateNumbers {

	/**
	 * 1. Make new list which will be inserted checked index 
	 * 2. Add arr[0] to list
	 * 3. Check whether arr[1] are same with arr[0] 
	 * 4. If they're not same, add value to list
	 *
	 **/

	public int[] solution(int[] arr) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) list.add(arr[0]);
			else
				if (arr[i - 1] != arr[i]) list.add(arr[i]);
		}

		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
		
		return answer;
	}
}
