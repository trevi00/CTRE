package _l_01_LinkedList._01_입문;

public class _03_리스트_길이_구하기 {
    int getLength1(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    int getLength2(ListNode head){
        if(head == null) return 1;
        return 1+getLength2(head.next);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        ListNode.fromArray(arr);
    }
}
