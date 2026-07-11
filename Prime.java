public class Prime {
    public static void main(String[] args) {
     int n = -9999;
     //int count = 0;

     if(n < 0 || n==1){
        System.out.println("NOT A PRIME , PRIME NUMBER STARTS FROM 2");
        return;
     }
     
     for(int i = 2; i*i< n; i++){
        if(n%i==0){
            //jo yaha tak aagya vhi prime nahi h
            System.out.println("Not a prime");
            return;
            //count = count + 1;
        }
     }System.out.println("Prime");
    
    }
}
