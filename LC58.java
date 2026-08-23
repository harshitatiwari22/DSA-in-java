import java.util.*;
public class LC58{
    static int findCount(String s,int count){
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i) !=' '){
            count++;
            i--;
        }
        return count;
    }
    public static void main(String[] args) {
        // String s = "a               ";
        // s=s.trim();
        // // System.out.println(s);
        // String[] words =s.split("\\s+"); 
        // // words[words.length-1];
        // System.out.println(words[words.length-1].length());
        // System.out.println(Arrays.toString(words));
        String s ="   fly me   to   the moon  ";
        int count=0;
        int ans =findCount(s,count);
        System.out.println(ans);

    }
}