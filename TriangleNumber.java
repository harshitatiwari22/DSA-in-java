package Patterns;

public class TriangleNumber {
    static void Triangle(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }

    }
    public static void main(String[] args) {
        Triangle(5);
    }
    
    
}
