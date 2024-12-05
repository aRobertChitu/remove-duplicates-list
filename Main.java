//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class Main {
    
    
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode current  = head;
        ListNode next = null;
        try {
             next = head.next;
        }catch (NullPointerException e){
            return null;
        }

        while(current!= null) {
            while ( next  != null && current.val == next.val) {
                next = next.next;
            }
            current.next = next;
            current = current.next;
        }

        return head;

    }


}