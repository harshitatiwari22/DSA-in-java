import java.util.HashSet;

public class continueNum {
    public static void main(String[] args) {
        int[] arr = {7,3,5,3,7,2,1,8};
        HashSet<Integer> set = new HashSet<>();
        int len = 0;
        int max = 0;
        for(int num:arr){
            set.add(num);
        }
        for(int num:arr){
            if(!set.contains(num-1)){
                int A = num;
                len = 1;
                while(set.contains(A+1)){
                    A++;
                    len++;
                }
                max = Math.max(max , len);

            }


        }
        System.out.println(max);
    }
    
}
