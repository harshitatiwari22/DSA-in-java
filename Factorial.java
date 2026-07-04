public class Factorial {
    static void fact(int num , int mul){
        if(num==0){
            System.out.println("fact of your num is "+mul);
            return;
        }
        // int digit = num%10;
        // mul =digit * mul;
        // System.out.println(mul);
        // fact(num/10,mul);

        
        mul = mul *num;
        System.out.println(mul);
        fact(num-1,mul);

    }
    public static void main(String[] args) {
        fact(6,1);
    }
        
    
}
