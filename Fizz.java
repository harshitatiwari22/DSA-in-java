
import java.util.*;
public class Fizz {
    
    public static void main(String[] args) {
        int[] arr=new int [15];
        for(int i =0;i<arr.length;i++){
            arr[i]=i+1;
            if(arr[i]%3==0 && arr[i]%5==0){
                 System.out.print("fizzbuzz "+" ");
                
            }
            else if(arr[i]%3==0){
                System.out.print("fizz "+" ");
                
            }
            else if(arr[i]%5==0){
                System.out.print("buzz "+" ");
                
            }
            else{
                
                System.out.print(arr[i]+" ");
            }

        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
    
}

