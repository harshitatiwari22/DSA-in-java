public class FIbonacci2 {
    static int Fibo(int n ){
        if(n<=1){
            return n ;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
    public static void main(String[] args) {
        int ans = Fibo(7);
        System.out.println(ans);
    }
    
}
