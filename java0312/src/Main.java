import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        if (day == 1 || day == 3 || day == 5 || day == 7) {
            System.out.println("oh my god~");
        } else {
            System.out.println("enjoy!");
        }

        scanner.close();
    }
}
