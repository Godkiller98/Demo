package ListNode;

import java.util.HashSet;

public class UniqueListNode {


      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            HashSet<Integer> al = new HashSet<>();
            ListNode dummy = new ListNode(-1);
            ListNode newList = dummy;

            while(head!=null){
                if(!al.contains(head.val)){
                    al.add(head.val);
                    newList.next = new ListNode(head.val);
                    newList = newList.next;
                }
                head=head.next;
            }
            return dummy.next;
        }
    }

}
