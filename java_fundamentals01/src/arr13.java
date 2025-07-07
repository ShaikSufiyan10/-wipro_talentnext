public class arr13 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        int[][] arr = new int[3][3];
        int index = 0;
        int max = Integer.MIN_VALUE;

        // Fill array and find max
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(args[index++]);
                if (arr[i][j] > max)
                    max = arr[i][j];
            }

        System.out.println("The biggest number is: " + max);
    }
}
