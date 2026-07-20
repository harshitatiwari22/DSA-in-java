package Patterns;

public class Number {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);              //O(n2)
            }
            System.out.println();
        }
    }
    
}
