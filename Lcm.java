public class Lcm {
    static int GCD(int max,int min){
        while(min>0){
            int rem = max%min;
            max=min;
            min=rem;
        }return max;
    }
    public static void main(String[] args) {
        int[] arr = {36,48};
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(max);
        int ans = GCD(max,min);
        int lcm = (max*min)/ans;
        System.out.println(lcm);


    }

    
}
