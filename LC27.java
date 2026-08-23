import java.util.*;
public class LC27{
    public static void main(String[] args) {
        int[] arr={0,1,2,2,3,0,4,2};
        int target=2;
        int x=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=target){
                x++;
                arr[x]=arr[i];
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(x+1);
    }
}