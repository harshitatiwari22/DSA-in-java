public class Palindrome {
    static void isPalindrome(int num,int copy,int reverse){
        if (num==0){
            if(reverse == copy){
                System.out.println("Palindrome");
            }else{
                System.out.println("not Palindrome");
            }
            return;
        }

        int digit = num%10;
        reverse = reverse*10 + digit;
        isPalindrome(num/10,copy,reverse);
        
        
    }

    public static void main(String[] args) {
        int num = 123;
        int copy = num;
        isPalindrome(num,copy,0);

        
    }
}
