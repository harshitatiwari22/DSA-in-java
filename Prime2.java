public class Prime2 {
    static void pno(int num){
        if(num<=1 ){
            System.out.println("prime number starts from 2");
            return ;
        }
        for(int i =2;i*i<=num;i++){
            if(num%i==0){
                System.out.println("not a prime");
                return;
            }
        }System.out.println("prime");
    }
    public static void main(String[] args) {
        pno(-99);
    }
    
}
