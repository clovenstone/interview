package com.ms.mspa.interview.java.question1;

import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Integer> scheduledStart = List.of(1, 1, 2, 3);
        List<Integer> scheduledEnd = List.of(2, 3, 3, 4);
        System.out.println(solution(scheduledStart, scheduledEnd));
    }

    private static int solution(List<Integer> scheduledStart, List<Integer> scheduledEnd) {
        // TODO implement your logic here.

        int maxCount = 0;
        for (int i = 0; i < scheduledStart.size(); i++) {
            int count = 0;
            int end = scheduledEnd.get(i);
            count++;
            while (scheduledStart.contains(end)) {
                if (scheduledStart.contains(end)) {
                    count++;
                    int index = scheduledStart.indexOf(end);
                    end = scheduledEnd.get(index);
                }
            }
            if (count > maxCount) {
                maxCount = count;

            }

        }
        return maxCount;
    }

}
