package Grind75;

public class MergeTwoSortedLists {



    public static void main(String[] args){
        // ListNode result = new ListNode();

        // if(){
        //     System.out.println("null");
        // }
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { 
            this.val = val; 
        }
        ListNode(int val, ListNode next) { 
            this.val = val; this.next = next; 
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode cur = result;

        // result.next = tmp;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                // tmp = new ListNode(list1.val);
                cur.next = list1;
                list1 = list1.next;
            }else{
                // tmp = new ListNode(list2.val);
                // tmp = tmp.next;
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        cur.next = (list1 == null) ? list2 : list1;

        return result.next;
    }
}
