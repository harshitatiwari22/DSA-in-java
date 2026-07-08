public class HappyNumber {
    public static void main(String[] args) {
        int num=2;
        int sum=0;
        while(num>10){
            sum=0;
        
        while(num>0){
            int digit=num%10;
            int sq = digit*digit;
            sum=sum+sq;
            num=num/10;
        }
        num=sum;
    }
        
        System.out.println(num);
        if(num==1){
            System.out.println("Happy Number");
        }else{
            System.out.println("not  a HappyNumber");
        }
    }
    
}
