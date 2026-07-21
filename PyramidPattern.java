package Patterns;

public class PyramidPattern {
    public static void main(String[] args) {
        int num=3;
        for(int i=0;i<num;i++){
            int j;
            for(j=0;j<=num-i-1;j++){
                System.out.print(" ");                //O(n2)
            }
            int k;
            for(k=j;k<=num+i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
