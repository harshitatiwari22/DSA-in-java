public class LC122 {
    static int SellBuy(int[] num,int max){
        for(int i=1;i<num.length;i++){
            if(num[i]>num[i-1]){
                max +=num[i]-num[i-1];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] num={7,1,5,3,6,4,9};
        int max=0;
        int ans=SellBuy(num,max);
        System.out.println(ans);


    }
    
}
