package _l_01_LinkedList._01_입문;

public class _05_삭제구현 {
    static void deleteNode(ListNode prevNode){
        prevNode.next = prevNode.next.next;
    }
}
