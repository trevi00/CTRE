package _l_01_LinkedList._01_입문;

public class _04_노드삽입 {
    static void addNode(ListNode preNode, ListNode nodeToAdd){
        ListNode curr = preNode.next;
        preNode.next = nodeToAdd;
        nodeToAdd.next = curr;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.fromArray(new int[]{1, 2, 4, 5});
        ListNode.printList(head); // Before: 1 -> 2 -> 4 -> 5

        ListNode pre = head.next; // 2번 노드
        ListNode nodeToAdd = new ListNode(3); // 3 삽입

        addNode(pre, nodeToAdd); // 2 -> 3 삽입
        ListNode.printList(head); // After: 1 -> 2 -> 3 -> 4 -> 5
    }
}
