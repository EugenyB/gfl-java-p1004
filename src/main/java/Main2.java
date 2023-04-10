import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Main2 main = new Main2();
        main.run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = in.nextInt();
            }
        }

        int[] colors = new int[n];
        for (int i = 0; i < colors.length; i++) {
            colors[i] = in.nextInt();
        }

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a[i].length; j++) {
                if (a[i][j] == 1 && colors[i] != colors[j]) count++;
            }
        }
        System.out.println(count);
    }
}
