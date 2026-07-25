package Patterns;

public class StarSpacePattern {
 public static void main(String[] args) {
    int num = 5;

    for(int i = 0; i<num; i++){
        //space
        int j ;
        for(j = 0; j < num-i -1; j++){
            
            System.out.print('_');
        }
        int k;
        for(k=j ; k<num; k++){
            System.out.print('*');
        } 
        System.out.println();
    }
 }   
}
