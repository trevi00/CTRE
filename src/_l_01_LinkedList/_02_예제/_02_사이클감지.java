package _l_01_LinkedList._02_예제;

public class _02_사이클감지 {
    static boolean hasCyle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            // 객체가 같습니까?
            if(slow == fast) return true;
        }

        return false;
    }
}
