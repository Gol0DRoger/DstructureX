//Optimized Approach: First we will check if cycle exists , If Yes then we will Reset the Slow -> head but let the Fast where it was and Start Loop -> both pointers with same speed (+1).
https://www.youtube.com/watch?v=-1E8ZMS0gSs
public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int pos = 0;
        boolean cycle = false;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(!cycle){
            return null;
        }
        slow = head;
        while(slow!=fast){
           slow = slow.next;
           fast = fast.next;
           } 
           return slow;
    }     

//IF I HAVE TO REMOVE THE CYCLE FROM ANY LINKEDLIST CYCLE, Make it normal :
//Just use an extra node to get the Last (fast) node in it and make it point to NULL in the end.
public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int pos = 0;
        boolean cycle = false;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(!cycle){
            return null;
        }
        slow = head;
  ListNode Prev = null;
        while(slow!=fast){
           slow = slow.next;
           Prev = fast;
           fast = fast.next;
           } 
  Prev.next = null; //Here we get 2nd last (before Meeting -> The Node which points to starting point of cycle). We point it to Null and break the cycle.
           return slow;
    }     
