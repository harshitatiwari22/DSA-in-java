import java.util.*;
public class LCMergeArray {
    public static void main(String[] args) {
        int[]arr1={1,2,3,7,8};
        int[]arr2={2,4,5,9,11};
        int i=0;
        int j=0;
        int[] ans =new int[arr1.length+arr2.length];
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;
            }
            else{
                ans[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length ){
            ans[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(ans));
            
    }
}
