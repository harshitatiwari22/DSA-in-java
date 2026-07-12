import java.util.Scanner;

public class Prime3{
    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter a number");
            int n=sc.nextInt();
            
            if(n<=0){
                System.out.println("Prime starts from 1");
                return;
            }
            for(int i=2;i<n-1;i++){
                if(n%i==0){
                    System.out.println("Not Prime");
                    return;   
                }
            }
            System.out.println("Prime");
            
}}