public class Recur{

    static void printNum(int num){
        //base case(stop condition)

        if(num == -1){
            return;
        }

        System.out.println("Hello Shubham "+ num);

        //recursive case
        printNum(num - 1);


    }
    public static void main(String[] args) {
        printNum(10);
    }
}
