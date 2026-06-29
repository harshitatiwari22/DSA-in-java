public class Arm2 {
    static int getCount(int num){
        //base case
        if(num == 0 ){
            return 0;
        }
        //recurive case
        return 1 + getCount(num/10);
    } 
    static int as(int num,int copy,int count,int sum){
        if(num==0){
            
            if(copy ==sum){
                System.out.println("armstrong number");
            }else{
                System.out.println("not armstrong");
            }
            return 0;
        }
        int digit = num%10;
        sum= sum + (int)Math.pow(digit,count);
        // System.out.println(A);
        return as(num/10,copy,count,sum);
    }
    public static void main(String[] args) {
        int num=153;
        int copy=num;
        int sum = 0;
        int count = getCount(num);
        as( num,copy,count,sum);
        
    }
    
}
