import java.util.Scanner;

public class SamYukGuGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i=1; i <= 40; i++) {
            if(i % 2 == 1) {
                if(i % 3 == 0) {
                    System.out.println("X");
                }
                System.out.println(i);
            }
//            else {
//                int num = scanner.nextInt();
//                if(num != ) {
//
//                }
//            }
        }

        scanner.close();
    }
}
