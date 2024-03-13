import java.util.Random;

public class Array7 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] a = new int[5][5];
        boolean[] used = new boolean[100];
        int totalCount = 0;

        while (totalCount < 25) {
            int num = r.nextInt(100) + 1;
            if (!used[num - 1]) {
                int row = totalCount / 5;
                int col = totalCount % 5;
                a[row][col] = num;
                used[num - 1] = true;
                totalCount++;
            }
        }

        int r_max = 0, r_min = 0;
        for (int j = 0; j < 5; j++) {
            int max = a[0][j], min = a[0][j];
            for (int i = 0; i < 5; i++) {
                if (a[i][j] > max) max = a[i][j];
                if (a[i][j] < min) min = a[i][j];
            }
            r_max += max;
            r_min += min;
        }

        System.out.println("최대값의 합: " + r_max);
        System.out.println("최소값의 합: " + r_min);
    }
}
