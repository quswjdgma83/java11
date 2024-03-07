package variable;

public class Variable5 {
    public static void main(String[] args) {
        String str = "abcdefg";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(Character.toUpperCase(str.charAt(i)));
        }
    }
}
