package Level2;

import java.util.Arrays;

// 2021.08.30
class FindTheMaximumSumOfArray {
    
    // the maximum number means the best case when you check sum of the top row and bottom row
    // which means that find the maximum sum between top and bottom row
    int solution(int[][] land) {
        
        for (int i = 1; i < land.length; i++){
           land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
           land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
           land[i][2] += Math.max(Math.max(land[i-1][1], land[i-1][0]), land[i-1][3]);
           land[i][3] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][0]);
       }

       int[] answer = land[land.length-1];
       Arrays.sort(answer);

       return answer[answer.length-1];
    }

/*
 * the way I solved -> failed
 * sum of each element
    [n][4] -> [0~n][0~3]
    1. find the maximum number of first row
    2. add to sum
    3. find the maximum number for second row except for in same column
    4. add to sum
    5. repeat 1, 2 until ~n-1
    
		int answer = 0;

        int col = 0;
        int maxCol = 0;
        for (int r = 0; r < land.length; r++) { // n
            //  find the maximum number
            int max = land[r][0];
            for (int c = 1; c < land[r].length; c++) { // 4
                if (c == maxCol) continue;
                else {
                    if (max < land[r][c]) {
                        max = land[r][c];
                        col = c;
                    }
                }
            }
            maxCol = col;
            answer += max;
        }
        
        return answer;
*/


}
