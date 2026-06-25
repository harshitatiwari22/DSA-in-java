class Main {
    public static void main(String[] args) {
        int arr[][] = {
            {2, 3, 4, 5, 2},
            {5, 6, 7, 8, 7},
            {8, 6, 4, 8, 7},
            {3, 5, 7, 5, 3}
        };

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }

            System.out.println();
        }
    }
}