public class Sod2 {
    static int again(int sum){
        if(sum>=10){
            return Calculate(sum, 0);
        }
        return sum;
    }
    static int Calculate(int num,int sum){
        if(num==0){
            return again(sum);                       //indirect recursion is used
        }
        int digit = num%10;                             
        sum = sum +digit;
        return Calculate(num/10, sum);
    }
    public static void main(String[] args) {
        int ans =Calculate(98765,0);
        System.out.println(ans);

    }
    
}
