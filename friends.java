import java.util.Scanner;

public class friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;

        if( a+b+c >= 2 ){
            count++;
        }
        System.out.println("total count is -->"+count);
    }

    
}
