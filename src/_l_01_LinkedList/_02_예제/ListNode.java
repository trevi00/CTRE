package _l_01_LinkedList._02_예제;

public class ListNode {
    public ListNode(int val) {
        this.val = val;
    }

    int val;
    ListNode next;

    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val);
            if(head.next != null){
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode fromArray(int[] arr){
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for(int i = 1; i < arr.length; i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
}
