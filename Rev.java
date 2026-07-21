package Patterns;

public class Rev {
    static void Reverse(int num,int sum){
        if(num==0){
            return;
        }
        int digit = num%10;
        System.out.print(digit);
        Reverse(num/10,sum);

    }
    
    public static void main(String[] args) {
        Reverse(7654,0);
    }
    
}
