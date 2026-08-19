public class Fibonacci {
    static int  fibonacci(int a , int b , int n ){
        if(n ==1){
            return b; 
        }
        int d = a+b;
        a = b;
        b = d;
        System.out.print(b+" ");
        return fibonacci(a, b, n-1);
        
    }
    public static void main(String[] args) {
        
        int ans = fibonacci(0 , 1 , 7);
        System.out.println(ans);
    }
    
}
