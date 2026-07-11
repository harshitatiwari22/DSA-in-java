public class Prime1 {
    static void pno(int num,int count){
        if (num==0){
            return;
        }
        for(int i=2;i<num-1;i++){
            if(num % i==0){
                count=count+1;
            }
        }
        if(count>2){
                System.out.println("not prime");
            }else{
                System.out.println("prime");
            }
        
        
    }
    public static void main(String[] args) {
        pno(18,0);
    }
    
}
