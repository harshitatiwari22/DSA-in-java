public class digital {

    static int again(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + again(num / 10);
    }

    static void digit(int num) {
        int sum = again(num);

        if (sum < 10) {
            System.out.println(sum);
            return;
        }

        digit(sum);
    }

    public static void main(String[] args) {
        digit(9785);
    }
}