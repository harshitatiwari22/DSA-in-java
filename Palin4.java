public class Palin4 {
    static void Palin(int num,int sum,int copy){
        if(num==0){
            if(copy==sum){
                System.out.println("Your number is a palindrome");
            }
            else{
                System.out.println("Number is not a palindrome");
            }
            return;
        }
        int digit=num%10;
        sum=sum*10+digit;
        Palin(num/10,sum,copy);
        
    }
    public static void main(String[] args) {
        int num=100;
        int copy=num;
        Palin(num,0,copy);
    }
    
}
