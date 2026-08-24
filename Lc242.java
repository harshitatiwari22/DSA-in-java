import java.util.Arrays;
public class Lc242 {
    static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] arr1 =s.toCharArray();
        char[] arr2 = t.toCharArray();
        System.out.println(arr1);
        System.out.println(arr2);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1);
        System.out.println(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        boolean ans=isAnagram(s,t);
        System.out.println(ans);
    }
    
}
