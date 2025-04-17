package _04_정렬_심화;

import java.util.PriorityQueue;

public class _04_가장작은수3개 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int[] nums = {8, 3, 1, 9, 5, 2, 4};

        for(int num : nums){
            pq.offer(num);
        }

        for(int i = 0; i < 3; i++){
            System.out.println(pq.poll());
        }

        // 제일 높은 수 3개

        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b) -> b-a);

        for(int num : nums){
            pq2.offer(num);
        }

        for(int i = 0; i < 3; i++){
            System.out.println(pq2.poll());
        }
    }
}
