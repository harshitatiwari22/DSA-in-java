public class Rprob {
    static void printnum(int n){ 
        
        if(n==0){
            return;
        }

         
        System.out.println(n%10);
        printnum(n /10);
        System.out.println(n%10);
          


    }
    public static void main(String[] args) {
        printnum(98765);
    }
    
}
