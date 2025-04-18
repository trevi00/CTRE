package _l_01_LinkedList._01_입문;

public class _02_리스트_전체_값의_합_구하기 {
    int getSum1(ListNode head){
        int sum = 0;
        while (head != null) {
            sum += head.val;
            head = head.next;
        }
        return sum;
    }

    // 단, 리스트가 매우 길 경우(예: 10^5개 이상)
    // Java에서는
    // StackOverflowError
    int getSum2(ListNode head){
        if (head == null) {
            return 0;
        }
        return head.val + getSum2(head.next);
    }
}
