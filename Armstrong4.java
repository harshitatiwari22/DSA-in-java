public class Armstrong4 {
    static int strong(int num){
        if(num==0){
            return 0;
        }
        return 1+strong(num/10);
    }
    static void Arm(int num,int copy,int sum,int count){
        if(num==0){
            if(sum==copy){
                System.out.println("Armstrong number");
            }
            else{
                System.out.println("not a Armstrong number");
            }
            return;
        }
        int digit=num%10;
        sum=sum+(int)Math.pow(digit,count);
        Arm(num/10,copy,sum,count);
        
    }
    public static void main(String[] args) {
        int num=1634;
        int copy= num;
        int count=strong(num);
        Arm(num,copy,0,count);
    }
    
}
