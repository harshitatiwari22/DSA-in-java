package Patterns;
public class TriPatt {
    static void draw(int num){
   
    for(int i=0;i<num;i++){
        
        for(int j =0;j<=i;j++){
            System.out.print(" ");
            
        }
        
        System.out.println();
    }
}
    public static void main(String[] args) {
        draw(5);
        
    }

}
