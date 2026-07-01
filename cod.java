public class cod {
    static void count(int num, int sum){
        if (num==0){
            System.out.println(sum);        
            return  ;
        }
        int add=1;
        sum = sum + add;
        //System.out.println(add);
        count(num/10, sum);  
    }    
    public static void main(String[] args) {
        count(4567, 0);
    }
    
}
