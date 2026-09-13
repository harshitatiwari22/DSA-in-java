public class ArmStrongg {
    public static void main(String[] args) {
        int n = 151;
        int copy = n;
        int count = strong(n);
        arm(n , 0,copy,count);
    }
    static void arm(int n ,int sum , int copy , int count){
        if(n ==0){
            if(sum ==copy){
                System.out.println("ArmStrong number");
            }
            else{
                System.out.println("naa h bhaiiiii.....");
            }
            
            return;
        }
        int digit = n%10;
        sum = sum + (int)Math.pow(digit, count);
        arm(n/10,sum,copy,count);
    }
    static int strong(int n){
        if(n ==0){
            return 0 ;
        }
        return 1+ strong(n/10);
    }
    
}
