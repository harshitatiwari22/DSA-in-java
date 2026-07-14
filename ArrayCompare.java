import java.util.*;
public class ArrayCompare {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,9};
        int[] arr2 ={9,5,7,3,2};
        boolean[] arr3=new boolean[arr1.length];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length != arr2.length){
            System.out.println("Arrays Size different");
            return;
        }
        for(int i=0;i<arr3.length;i++){
            if(arr1[i]==arr2[i]){
                arr3[i]=true;
            }
            else{
                arr3[i]=false;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }  
}
