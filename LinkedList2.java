public class LinkedList2{
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
    Node newNode = this. new Node(value);
    newNode.next = head;
    head = newNode; 
    }
    public void printList() {
        Node current = head;
        while(current !=null){
            System.out.print(current.data +" ");
            current = current.next;
        }
    } 
    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.insertAtHead(20);
        // list.printList();

        list.insertAtHead(10);
        // list.printList();

         list.insertAtHead(70);
        list.printList();
    }
}