public class k {
    public static void JaibabaKi(int[] arr,int k,int count){
        int Final=0;
        int energy =k;

        for(int i=0;i<arr.length;i++){
            while(arr[i]>k){
                k +=energy;
                count++;
                Final = count+Final;
            }
            k -=arr[i];
        }
        System.out.println(Final);
        }
    public static void main(String[] args) {
        int[] arr= new int[]{10,1,1};
        int k=5;
        int count=0;
        JaibabaKi(arr,k,count);
    }
    
}
