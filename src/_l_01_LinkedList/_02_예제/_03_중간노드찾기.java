package _l_01_LinkedList._02_예제;

public class _03_중간노드찾기 {
    static int getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // fast가 리스트를 벗어났을때가 중간임
        return slow.val;
    }
}
