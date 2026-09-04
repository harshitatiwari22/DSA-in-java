package Stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Stack101 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        st.pop();

        System.out.println(st.peek());
        System.out.println("OG stack..."+ st);
    //     int stackSize = st.size();

    //     int[] arr = new int[stackSize];
    //     int i = 0;
    //     System.out.println("array length: "+ arr.length);
    //     while(st.size() >0){
    //         int top = st.pop();
    //         System.out.println(top);
    //         arr[i] = top;
    //         i++;
           
    //     }
    //     System.out.println("array..."+ Arrays.toString(arr));
    //     System.out.println(st);
    //     int n = arr.length-1;
    //     while(n>=0){
    //         st.push(arr[n]);
    //         n--;

    //     }
    //     System.out.println("stack from array "+ st);

    while(st.size() > 0){
        int top = st.pop();
        System.out.println(top);//printing for traversal
        st2.push(top);
    }
    System.out.println("stack1.. "+ st);
    System.out.println("stack2.. "+ st2);

    while(st2.size() > 0){
        int top = st2.pop();
        System.out.println("stack2 se aarha hu: "+ top);//printing for traversal
        st.push(top);
    }
    System.out.println("stack1.. "+ st);
    System.out.println("stack2.. "+ st2);
 }
}