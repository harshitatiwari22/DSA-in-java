package Patterns;

public class Numtri {
    static void Triangle(int num,int sum){
        if(num==0){
            return;
        }
        int digit = num%10;
        sum = sum*10 + digit;
        System.out.println(sum);
        Triangle(num/10,sum);
    


    }
    public static void main(String[] args) {
        Triangle(010101,0);
        
    }
    
}
