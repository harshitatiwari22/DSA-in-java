public class SumOfDigita {
    
    static void sum(int num, int add){
        //base case
        if(num ==0){
            return;
        }
//         int digit = num % 10;
//         add = add + digit;
//         System.out.println(add);
//         //recurive case
//         sum(num/10);
        
        int digit = num % 10;
        add = add + digit;
        System.out.println(add);
        sum(num/10, add); //function calling itrself
    }
    public static void main(String[] args) {
        sum(98765, 0);  //function calling
    }
}
