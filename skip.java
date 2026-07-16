public class skip{
    public static void main(String[] args) {
        // int n=10;
        // while(n>0){
        //     if(n==2 || n==3 ||n==5){
        //         n--;
        //         continue;
        //     }
        //     System.out.println(n);
        //     n--;
        // }
        int num=10;
        int i=0;
        while(i<=num){
            if(i==5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}