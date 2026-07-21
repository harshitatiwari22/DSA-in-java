package Patterns;

public class PyramidPattern2 {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num;i++){
            int j;
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            int k;
            for(k=j;k<=num+num-i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
