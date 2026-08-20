package Patterns;

public class StarPattern4 {
    public static void main(String[] args) {
        
    
    int num=5;
    for(int i=0;i<num;i++){
        int j;
        for(j=0;j<i;j++){
            System.out.print(" ");
        }
        int k;
        for(k=j;k<num;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
