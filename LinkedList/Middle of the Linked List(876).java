//(BRUTEFORCE)Just calculating the size of linkedlist and then finding the rounded middle number , and then traversing the head to that number/Node -> 2 Loops in total.
public ListNode middleNode(ListNode head) {
        int s = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            s++;
        }
        float a = (s+1)/2.0f;
        int b = (s+1)/2;
        if(a>b){
            b = b+1;
        }
        int x =1;
        ListNode current = head;
        while(x<b){
            current = current.next;
            x++;
        }
        head = current;
        return head;
    }

//OPTIMIZED SLOW & FAST POINTER APPROACH, SLOW +1 AND FAST +2.
public ListNode middleNode(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       while(fast!= null && fast.next!= null){
        slow = slow.next;
        fast = fast.next.next;
       }
       return slow;
    }
