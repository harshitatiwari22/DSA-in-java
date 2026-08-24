import java.util.*;
public class LC167{
    static int[] BinarySearch(int[]arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11,13};
        int target=22;
       int[] ans= BinarySearch(arr,target);
       System.out.println(Arrays.toString(ans));
    }
}