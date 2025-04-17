package _l_01_LinkedList._01_입문;

import javax.sound.midi.Soundbank;

public class ListNode {
    int val;
    ListNode next;

    // 생성자
    public ListNode(int val){
        this.val = val;
    }

    public static void printList(ListNode head){
        while (head != null){
            System.out.println(head.val);
            if(head.next != null) System.out.println(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode fromArray(int[] arr) {
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
