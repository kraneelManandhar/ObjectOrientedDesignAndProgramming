package workshop;

public class QN1 {

    public static void main(String[] args) {
        int i = 5;

        try {
            System.out.println(7 / 0);  // Arithmetic Exception
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        }

        try {
            if (i == 0)
                return;
            else {
                test(i++);
            }
        } catch (StackOverflowError e) {
            System.out.println("StackOverflow Error caught!");
        }
    }

    public static void test(int n) {
        test(n + 1);
    }
}