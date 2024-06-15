package com.problem;

import java.util.Queue;

public class ReverseQueue {

     public static Queue<Integer> reverseFirstK (Queue<Integer> queue, int k) {
        solveQue(queue, k);
        int n = queue.size() - k;
        while (n-- > 0) {
            int element = queue.remove();
            queue.add(element);
        }
        return queue;
     }

    private static void solveQue (Queue<Integer> queue, int k) {
        if (k == 0) return;
        int element = queue.remove();
        solveQue(queue, k-1);
        queue.add(element);
    }

}