package Codility.Lesson15;

// 2021.10.16
// 2. CountDistinctSlices` in codility (Lesson 15)
class Solution {
    public int solution(int M, int[] A) {
        
    	boolean[] seen = new boolean[M+1]; // 0~M

        // pair (p, q)
        int p = 0;
        int q = 0;
        int count = 0;

        // move p and q
        while (p < A.length && q < A.length) {

            if (seen[A[q]] == true) { // case1. not distinct
                seen[A[p]] = false;
                p++;
            }
            else { // case2. distinct
                seen[A[q]] = true;
                count += (q - p + 1); // not just 'count++;', it has to be + (q - p + 1)
                q++;
            }

            if (count > 1000_000_000) return 1000_000_000;
        }
        
        return count;
        
    }
}
