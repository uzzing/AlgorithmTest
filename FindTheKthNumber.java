package Level1;

import java.util.ArrayList;
import java.util.Collections;

// 2021.08.23
class FindTheKthNumber {

	/**
	 * if commands[0][0] = [2, 5, 3] (=[i, j, k]) 
	 * -> array[2]~[5] and
	 *    sort by ascending and 
	 *    pick 3rd number
	 *
	 **/
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = {};

		ArrayList<Integer> pick = new ArrayList<>();

		// 1. get commands element i, j, k
		for (int x = 0; x < commands.length; x++) {

			int[] arr = commands[x];
			int i = arr[0];
			int j = arr[1];
			int k = arr[2];

			// 2. get index i ~ j from array
			ArrayList<Integer> list = new ArrayList<>();
			for (int a = i - 1; a < j; a++)
				list.add(array[a]);

			// 3. sort by ascending
			Collections.sort(list);

			// 4. get the 'k'th number
			pick.add(list.get(k - 1));
		}

		answer = new int[pick.size()];
		answer = pick.stream().mapToInt(Integer::intValue).toArray();

		return answer;
	}
}
