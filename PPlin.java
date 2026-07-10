import java.util.*;
public class PPlin{
    public static void main(String[] args) {
        int[] arr={1,4,6,7,6,4,1};
        int[] arr2=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            arr2[j]=arr[i];
            j++;
        }
        if(Arrays.equals(arr, arr2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not pALINDOME");
        }
        
        
    }
}