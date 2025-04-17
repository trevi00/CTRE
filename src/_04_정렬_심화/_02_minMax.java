package _04_정렬_심화;

import java.util.PriorityQueue;

public class _02_minMax {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

        for(int num : nums){
            pq.offer(num);
        }

        for(int i = 0; i < 2; i++){
            pq.poll();
        }

        // 3번째 작은수
        System.out.println(pq.peek());
    }
}
