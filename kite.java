package Patterns;
public class kite {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num;i++){
            int j;
            for(j=0;j<=num-i-1;j++){
                System.out.print("_");
            }
            int k;                   
            for(k=j;j<=num+i;j++){                         //O(n2)
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<num;i++){
            int j;
            for(j=0;j<=i;j++){
                System.out.print("-");
            }
            int k;
            for(k=j;k<=num*2-i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
