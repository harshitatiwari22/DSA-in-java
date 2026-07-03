public class Cod3 {

    static int getCount(int num){
        //base case
        if(num == 0 ){
            return 0;
        }
        //recurive case
        return 1 + getCount(num/10);

    } 
    public static void main(String[] args) {
        int ans = getCount(12345);
        System.out.println(ans);
    }
}

