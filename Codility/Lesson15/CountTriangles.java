package Codility.Lesson15;

import java.util.Arrays;

// 2021.10.17
// 3. CountTriangles` in codility (Lesson 15)

class Solution {
    
    // Encapsulation
    private int count = 0;
    private int[] A;

    public int solution(int[] A) {
        this.A = A;
        Arrays.sort(this.A);

        for (int p = 0; p < A.length - 2; p++) {

            int q = p + 1;
            int r = q + 1;

            while (q < A.length - 1) {
                if (r < A.length && isTriangular(p, q, r)) {
                    r++;
                } else {
                    count += (r - q - 1); // important
                    q++;
                }
            }
        }

        return count;
    }

    // abstraction
    private boolean isTriangular(int p, int q, int r) {
        return A[p] + A[q] > A[r] && A[q] + A[r] > A[p] && A[r] + A[p] > A[q];
    }
}