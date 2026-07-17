public class SumOfDigit1 {
    static int calculateSingleDigitSum(int num){
        while(num >=10){
            int sum = 0;

            while(num>0){

                int digit = num % 10;
                sum = sum + digit;
                num = num /10; //stop condition

            }
            num = sum;
            //stop condition
        }
        return num;
    }
    public static void main(String[] args) {
        int ans = calculateSingleDigitSum(9875);
        System.out.println(ans);
    }
}
