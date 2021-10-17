package Codility.Lesson15;

import java.util.Arrays;
import java.lang.Math;

// 2021.10.17
// 4. MinAbsSumOfTwo` in codility (Lesson 15)

class Solution {
    public int solution(int[] A) {
       int min = Integer.MAX_VALUE;
       int p = 0;
       int q = A.length - 1;

       Arrays.sort(A);

       while (p <= q) {
            int current = A[p] + A[q];
            min = Math.min(min, Math.abs(current));
            
            // caterpillar method
            if (current < 0) p++; // -
            else q--; // +
       }
    
        return min;
    }
}
