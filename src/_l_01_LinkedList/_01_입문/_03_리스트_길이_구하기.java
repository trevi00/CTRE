package _l_01_LinkedList._01_입문;

public class _03_리스트_길이_구하기 {
    static int getLength1(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    static int getLength2(ListNode head){
        if(head == null) return 0;
        return 1+getLength2(head.next);
    }

    //깊은 리스트에선 StackOverflow 가능성 (e.g. 노드 수 10^5 이상)
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        ListNode l = ListNode.fromArray(arr);

        System.out.println(getLength1(l));
        System.out.println(getLength2(l));

    }
}
