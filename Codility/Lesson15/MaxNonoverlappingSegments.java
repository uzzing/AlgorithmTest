package Codility.Lesson15;

// 2021.10.16
// 1. AbsDistinct ` in codility (Lesson 15)
class Solution {
    public int solution(int[] A) {

        Set<Integer> set = new HashSet<>();

        for (int i : A)
            set.add(Math.abs(i));

        return set.size();
    }
}