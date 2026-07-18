package Patterns;

public class ASCII2 {
    public static void main(String[] args) {
        int num=69;
        for(int i=65;i<=num;i++){
            for(int j=i;j<=num;j++){                    //O(n2)
                System.out.print((char)j);
            }
            System.out.println();

        }
    }
    
    
}
