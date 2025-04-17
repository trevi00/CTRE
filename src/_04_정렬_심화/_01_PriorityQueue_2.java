package _04_정렬_심화;

import java.util.PriorityQueue;

public class _01_PriorityQueue_2 {
    public static void main(String[] args) {
        //항상 가장 작은 값 / 가장 큰 값을 빠르게 꺼내야 할 때 쓰는 구조
        //내림차순
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        pq.offer(5);
        pq.offer(2);
        pq.offer(9);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
