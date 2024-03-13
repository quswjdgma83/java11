import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            int num = r.nextInt(100) + 1;
            a[i] = num;
        }

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double avg = (double) sum / a.length;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
    }
}
