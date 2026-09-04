

public class Stack102{
    class Node{
        int data ; 
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node top = null;

    void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    
    

    int pop(){
        if(top == null){
            throw new RuntimeException("Stack Underflow");
        }
        top.next = top;
        size--;
        return top.data;
        
    }
    int peek(){
         if(top == null){
            throw new RuntimeException("Stack Underflow");
        }
        return top.data;
    }
    boolean empty(){
        return top == null;
    }
    void printStack(){
        Node curr = top;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
        }
        int size=0;
        int sizeOfStack(){
            Node curr = top;
            
            while(curr != null){
                size++;
                curr = curr.next;
            }
            return size;
        }
        public static void main(String[] args) {
            Stack102 s1 = new Stack102();
            s1.push(10);
            s1.push(20);
            s1.push(30);
            s1.push(40);
            
            s1.printStack();
            System.out.println("size"+s1.sizeOfStack());
            
        }
}
