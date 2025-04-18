package _l_01_LinkedList._02_예제;

public class _04_페어스왑 {
    // 노드를 2개씩 묶어서 서로 스왑한 새로운 리스트
    // 1 2 3 4
    // 2 1 4 3
    // 1 2 3
    // 2 1 3

    /*dummy → 1 → 2 → 3 → 4
         ↑    ↑
      first second
*/
    /*dummy → 2 → 1 → 3 → 4
                  ↑
                 head
*/

    static ListNode swapPairs(ListNode head){
        // 예외 처리
        // head.next 접근 시 NullPointerException 발생 가능
        if(head == null && head.next == null) return head;

        // 스왑된 새로운 head를 쉽게 참조하려면
        // dummy 노드를 만드는 게 좋다.
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        while(head != null && head.next != null){
            ListNode first = head;
            ListNode second = head.next;

            //  d A B C
            //  d -> B
            prev.next = second;

            //  A -> C
            first.next = second.next;
            //  B -> A
            second.next = first;

            prev = first;
            head = first.next;
        }

        return dummy.next;
    }
}
