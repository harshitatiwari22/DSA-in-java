public class LinkedListOP {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    //operation at head.....
    public void insertAtHead(int value){
        Node newNode = this.new Node(value);
        newNode.next = head;
        head = newNode;
    }
    //operation at tail....
    public void insertAtTail(int value){
        Node newNode = this.new Node(value);
        Node curr = head;
        if(head ==null){ //edge case if no node exist then provide head to the new node and return 
            head = newNode;
            return;
        }
        while(curr.next !=null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    // operation to find index.. (index jaisa kuch hota nhi h pr hmare chull h to nikalege)..
    public int getindex(int index){
        Node curr = head;
        int count = 0;
        while(curr != null){
            if(curr.data == index){
                return count;
            }
            count++;
            curr = curr.next;
        }
        return -1;
    }
    //operation to find element is present or not...
    public boolean findvalue(int value){
        Node curr =head;
        while(curr != null){
            if(curr.data == value){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
    // operation to find total number of nods present in linkedlist
    public int totalnode(){
        Node curr = head;
        int count = 0;
        while(curr !=null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    //operation to delete head element..
    public void deleteAtHead(){
        if(head == null){
            return;
        }
        head = head.next;
    }
    // operation for printing
    public void printList(){
        Node curr = head;
        while(curr !=null){
            System.out.print(curr.data +"->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    // ye too mainn h....
    public static void main(String[] args) {
        LinkedListOP list = new LinkedListOP();
        // list.insertAtHead(10);
        // list.insertAtHead(20);
        // list.insertAtHead(30);
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.printList();
        System.out.println(list.getindex(30));
        System.out.println(list.findvalue(90));
        System.out.println(list.totalnode());
        list.deleteAtHead();
        list.printList();

    }
    
}
