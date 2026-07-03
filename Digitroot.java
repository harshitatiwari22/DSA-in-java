public class Digitroot {
    static int again(int num){
        if(num==0){
            return 0;
        }
        return num%10+again(num/10);
    }
    static void digital(int num,int sum,int digit){
        if(num==0){
            // System.out.println(sum);
            if(sum<10){
                System.out.println(sum);
            }else{
                again(sum);}
        }
        digit=num%10;
        sum=sum+digit;
        // System.out.println(sum);
        digital(num/10,sum,digit);
    }
    public static void main(String[] args) {
        int num=7895;
        digital(num,0,0);
    }
}
