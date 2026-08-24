import java.util.*;
public class LCC {
    public static void main(String[] args) {
        String s = " my name is daku mangal singh";
        s=s.trim();
        // System.out.println(s);
        String[] words =s.split("\\s+"); 
        //words[words.length-1];
        System.out.println(words[words.length-1].length());
        System.out.println(Arrays.toString(words));
    }
    
}
