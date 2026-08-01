public class LinkedList{
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
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr =curr.next;
        }
        System.out.println("null");
    }
    public int getValue(int index){
        Node current = head;
        int count = 0;
        while(current != null){
            if(count == index){
                return current.data;
            }
            count++;
            current = current.next;
        }
        return -1;
    }
    public int getSize(){
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public boolean search(int value){
        Node current = head;
        while(current !=null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void deleteAtHead(){
        if(head == null){
            return;
        }
        head = head.next;
        
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.printList();
        System.out.println(list.getValue(2));
        System.out.println(list.getSize());
        System.out.println(list.search(10));
        list.deleteAtHead();
        list.printList();
    } 
}
