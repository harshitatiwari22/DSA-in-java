package Patterns;

public class ASCII3 {
    public static void main(String[] args) {
        
    
    int num=5;
    int ch = 97;
    for(int i=1;i<=num;i++){
        for(int j=1;j<=i;j++){                         //O(n2)
            System.out.print((char)ch);
        }
        System.out.println();
        ch++;

    }
}
}
