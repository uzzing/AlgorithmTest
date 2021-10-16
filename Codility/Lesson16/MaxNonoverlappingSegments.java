package Codility.Lesson16;

// 2021.10.15
// 1. MaxNonoverlappingSegments` in codility (Lesson 16)

class Solution { 
    public int solution(int[] A, int[] B) {
        
        int N = A.length;
        if (N == 0) return 0;

        int count = 1; // standard : skip A[0], B[0]
        int b_end = B[0];

        for (int i = 1; i < N; i++) {
            if (A[i] > b_end) {
                count++;
                b_end = B[i];
            }
        }

    } 
}
