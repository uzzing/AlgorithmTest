package Level1;

// 2021.08.22 02:30PM
class SortStringArrayBySpecificIndex {
	/**
	 * Bubble sort 
	 **/
	public String[] solution(String[] strings, int n) {

		String[] answer = {};

		for (int j = strings.length - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				String left = strings[i];
				String right = strings[i + 1];

				if (left.charAt(n) > right.charAt(n)) {
					strings[i + 1] = left;
					strings[i] = right;
				}
				else if (left.charAt(n) == right.charAt(n)) {
					if (left.compareTo(right) > 0) { // if left > right
						strings[i + 1] = left;
						strings[i] = right;
					}
				}
			}
		}
		answer = strings;

		return answer;
	}
}
