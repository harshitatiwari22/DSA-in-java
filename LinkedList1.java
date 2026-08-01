public class LinkedList1 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void insertAtHead(int value){
        Node newNode = this.new Node(value);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtTail(int value){
        Node newNode = this.new Node(value);
        Node current = head;
        if(head ==null){
            head = newNode;
            return;
        }
        while(current.next !=null){
            current  = current.next;
        }
        current.next = newNode;
    }
    public void printList(){
        Node curr = head;
        while(curr !=null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public boolean Search(int value){
        Node curr = head;
        while(curr !=null){
            if(curr.data == value){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }
    public int getValue(int value){
        Node curr = head;
        int count = 0;
        while(curr !=null){
            if(curr.data == value){
                return count;
            }
            count++;
            curr =curr.next;
        }
        return -1;
    }
    public int getSize(){
        Node curr = head;
        int count =0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;

    }
    public void deleteAtHead(){
        if(head == null){
            return;
        }
        head = head.next;
    }
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.printList();
        System.out.println(list.Search(10));
        System.out.println(list.getValue(20));
        System.out.println(list.getSize());
        list.deleteAtHead();
        list.printList();
        
    }
    

    
}
