public class LLPractice {
    Node head;
    private int size = 0;
    class Node{
        int data;
        Node next;

        public Node( int value) {
            data = value;
            next = null;
            size++;
        }
        
    }

    //Add first
    public void addFirst(int value){
        Node newNode = new Node(value);
        newNode.next= head;
        head = newNode;
    }
    //Add Last
    public void addLast(int value){
        Node newNode = new Node(value);
        if(head == null){
head = newNode;
return;
        }
        Node currentNode = head ;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    //Remove first 
    public void removeFirst(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        size--;
        head = head.next; //next node or null
    }
    //Remove last
    public void removeLast(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        size--;
if(head.next==null){
head=head.next;
return;
}
        Node SecLastNode = head;
        while(SecLastNode.next.next != null){
            SecLastNode = SecLastNode.next;
        }
        SecLastNode.next=null;
    }
    //PrintList
    public void printList(){
        Node currentNode = head;
        while(currentNode!= null){
System.out.print(currentNode.data+"->");
currentNode = currentNode.next;
        }
        System.out.print("null\n");
    }
    //Size
    public void size(){
        System.out.println("Size:"+size);
    }

//============================================

//REVRSE A LINKED LIST
public Node reverse(Node head){
    if(head == null || head.next == null){
        return head;
    }
    Node Prev = head;
    Node current = head.next;
    while(current!= null){
        Node Next = current.next;
        current.next = Prev;
        Prev = current;
        current= Next;
    }
    head.next = null;
    head = Prev;
    return head;
}


//RVERSE USING STACK
public Node reverseStack(Node head){
if(head == null || head.next ==null){
    return head;
}
Stack<Integer> values = new Stack<>();
while(head!= null){
    values.push(head.data);
    head = head.next;
}
Node newhead = new Node(values.pop());
Node current = newhead;
while(!values.isEmpty()){
    current.next = new Node(values.pop());
    current = current.next;
}
current.next = null;
return newhead;
}

//RECURSIVE APPROACH JUST LIKE STACK WORKING (in progress)



    /*public static void main(String[] args) {
    LLPractice newList = new LLPractice();
    newList.addFirst(24);
    newList.addLast(34);
    newList.addFirst(2);
    newList.addLast(40);
    newList.printList();
    newList.size();
    
    newList.head = newList.reverseStack(newList.head);
    newList.printList();
    }
}*/
