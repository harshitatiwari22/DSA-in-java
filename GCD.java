public class GCD {
    public static int calcGCD(int a, int b){

        while(b>0){
        int rem = a % b;
        a = b;
        b = rem;
        System.out.println("b"+ b);
        System.out.println("a"+ a);
        System.out.println("rem"+ rem);
        }
        System.out.println("aaa"+a);

        return a;

    }
    public static void main(String[] args) {
        int ans =  calcGCD(3, 94);
        System.out.println(ans);
    }
}
