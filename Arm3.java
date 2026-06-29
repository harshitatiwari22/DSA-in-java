public class Arm3 {
    static int getcount(int num){
        if(num==0){
            return 0 ;
        }
        return 1+getcount(num/10);
    }
    static int arm(int num,int sum,int count,int copy){
        if(num==0){
              if(copy==sum){
        System.out.println("Armstrong number");}
        else{
            System.out.println("not armstrong");
        }
            return 0 ;
        }
        int digit=num%10;
        sum=sum+(int)Math.pow(digit,count);
        return arm(num/10,sum,count,copy);
    }
    public static void main(String[] args) {
        int num=123;
        int copy=num;
        int count=getcount(num);
        arm(num,0,count,copy);
    }
}
