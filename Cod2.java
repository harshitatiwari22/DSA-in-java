public class Cod2 {
    static int count(int num,int sum){
        if(num==0){
            System.out.println(sum);
            return sum;
        }
        int add=1;
        sum=sum+add;
        return count(num/10,sum);
        
    }
    
    public static void main(String[] args) {

        int helloSum = count(3456,0) ;
        System.out.println(helloSum);

        
    }
    
}
