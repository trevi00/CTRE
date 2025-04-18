package _l_01_LinkedList._01_입문;

public class _01_리스트의_모든_값_출력 {
    void printList1  (ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    String printList2(ListNode head) {
        if (head == null) {
            return "";
        }
        return head.val + " " + printList2(head.next);
    }
}
