public class Palin3 {
    static void Pali(int num,int rev){
        if(num==0){
            return;
        }
        int digit= num%10;
        rev = rev*10+digit;
        System.out.println(rev);
        Pali(num/10,rev);
        System.out.println(rev);

    }
    public static void main(String[] args) {
        Pali(12321,0);
    }
    
}
