import java.util.List;
import java.util.Scanner;

public class Main {

    List<String> list;

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            int x;
            while ((x = in.nextInt()) != 0) {
                a[i][x - 1] = 1;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
