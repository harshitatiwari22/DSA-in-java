class Palind2{
    static void Pali(int num,int rev,int copy){
        if(num==0){
            if(copy ==rev){
                System.out.println("cheetahhh....palindrome h ");
            }else{
                System.out.println("naa h palindrome");
            }
            
            return ;
        }
        int digit = num%10;
        rev = rev*10 + digit;
        // System.out.println(rev);
        Pali(num/10,rev,copy);
    }
    public static void main(String[] args) {
        int num=12321;
        int copy = num;
        Pali(num,0,copy);
        
    }
}
