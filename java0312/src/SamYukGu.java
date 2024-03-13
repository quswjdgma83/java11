import java.util.Scanner;

public class SamYukGu {
    public static void main(String[] args) {
        System.out.print("10이하의 정수를 입력해주세요: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > 10) {
            boolean flag = true;
            while (flag) {
                System.out.print("10이하의 정수를 입력해주세요: ");
                num = scanner.nextInt();
                if(num <= 10) {
                    flag = false;
                }
            }
        }
        for(int i=1; i <= num; i++) {
            if(i % 3 == 0) {
                System.out.print("X ");
            }
            else {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
