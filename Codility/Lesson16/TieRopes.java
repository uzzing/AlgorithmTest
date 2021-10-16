package Codility.Lesson16;

// 2021.10.16
// 2. TieRopes in codility (Lesson 16)

class Solution { 
    public int solution(int K, int[] A) {
        // return count when the sum is greater than or equals to K

        int count = 0;
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];

            if (sum >= K) {
                count++;
                sum = 0;
            }
        }

        return count;
    } 
}