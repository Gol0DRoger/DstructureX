//Optimized SLOW-FAST POINTER APPROACH -> SLOW (+1) AND FAST (+2) Speed. Fast Speed = 2* Slow Speed.
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
    while(fast!=null && fast.next!=null){
       slow = slow.next;
       fast = fast.next.next;
       if(slow == fast){
        return true;
       }
    }
    return false;
    }
}
