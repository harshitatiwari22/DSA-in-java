package Patterns;

public class ASCII{
    public static void main(String[] args) {
        int num=69;
        for(int i=65;i<=num;i++){                          //O(n2)
            for(int j=65;j<=i;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }

    }
    
}
