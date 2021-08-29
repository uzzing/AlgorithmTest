package Level2;

// 2021.08.29
class MatrixMultiplication {
	
	public int[][] solution(int[][] arr1, int[][] arr2) {
		
		int[][] answer = new int[arr1.length][arr2[0].length];

		for (int i = 0; i < arr1.length; i++) { // 0 1 2
			for (int j = 0; j < arr2[0].length; j++) { // 0 1
				for (int k = 0; k < arr1[0].length; k++) { // 0 1
					answer[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}

		return answer;
	}
}

// 1 4 		3 3 	 => 15 15
// 3 2 		3 3 		15 15
// 4 1 					15 15
// [0][++] * [++][0], [++][1]
// [1][++] * [++][0], [++][1]
// [2][++] * [++][0], [++][1]
