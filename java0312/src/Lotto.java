import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] selected = new int[6];
        int prize = 0;
        while (prize < 6) {
            int r = rand.nextInt(45) + 1;
            boolean isDuplicated = false;
            for (int i = 0; i < prize; i++) {
                if (selected[i] == r) {
                    isDuplicated = true;
                    System.out.print("\b(중복발생! 재추첨) ");
                    break;
                }
            }
            if (!isDuplicated) {
                selected[prize] = r;
                System.out.print(r + " ");
                prize++;
            }
        }
    }
}
