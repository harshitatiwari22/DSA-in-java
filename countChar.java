import java.util.*;
public class countChar {
    public static void main(String[] args) {
        int n = 4;
        String  ch = "words";
        char[] arr = ch.toCharArray();

        char a = arr[0];
        char b = arr[arr.length -1];
        int c = 0;
        int count = 0;
        for(int i =0 ; i<arr.length;i++){
            c++;
        }
        for(int i =1 ; i<arr.length-1;i++){
            count++;
        }

        if(c >n){
            System.out.println(String.valueOf(a)+count+b);
        }
        else{
            System.out.println(ch);
        }
    }
    
}
