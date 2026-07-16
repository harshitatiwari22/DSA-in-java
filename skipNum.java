
public class skipNum {
    static void num(int n){
        while(n<=15){
            if(n==5){
                n++;
                
                continue;
            }
            System.out.println(n);
            n++;
        }

    }
    public static void main(String[] args) {
        int n=0;
        num(n);
    }
    
    
}
