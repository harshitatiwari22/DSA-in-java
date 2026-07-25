package Patterns;
public class TrinagularPattern1 {
    static void drawPattern(int num){
        //outer loop
        for (int row = 0; row <num; row++){
            //inner loop columns print
            for(int col = 0; col<=row; col++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        drawPattern(5);
    }
}
