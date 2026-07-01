public class Armstrong {
    static void as(int num,int A,int copy){
        if(num==0){
            
            if(copy ==A){
                System.out.println("armstrong number");
            }else{
                System.out.println("not armstrong");
            }
            return;
        }
        int digit=num%10;
        A= A*1+ digit*digit*digit;
        // System.out.println(A);
        as(num/10,A,copy);
        
    }
    public static void main(String[] args) {
        int num=153;
        int copy=num;
        as( num,0,copy);
    }
    
}
