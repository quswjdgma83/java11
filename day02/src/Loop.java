import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out: while (true) {
            System.out.println("Input Command ...[q, c, r, u, d]");
            String cmd = sc.next();
            if(cmd.equals("q")) {
                System.out.println("Bye");
                sc.close();
                break;
            }
            switch (cmd) {
                case "c" :
                    System.out.println("Create"); break;
                case "r" :
                    System.out.println("Read");
                    sc.close();
                    break out; // 위에있는 while의 break다
                case "u" :
                    System.out.println("Update"); break;
                case "d" :
                    System.out.println("Delete"); break;
            }
        }
        System.out.println("End");
    }
}
