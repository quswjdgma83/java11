package operator;

public class Operator1 {
    public static void main(String[] args) {
        long a = 10;
        long b = 10;
        long c = a/b;
        System.out.println(c);

        int i = 10;
        int j = 3;
        double k = i*1.0/j;
        System.out.println(k);

        int bb = (3 > 5) ? 10: 20;
        System.out.println(bb);

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int num4 = 0;
        num4 = (num1 > num2) ? ((num1 > num3) ? num1:num3) : ((num2 > num3) ? num2: num3);
        System.out.println(num4);
    }
}
