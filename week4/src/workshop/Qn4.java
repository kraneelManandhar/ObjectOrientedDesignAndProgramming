package workshop;

public class Qn4 {
    public static void main(String[] args) {

        try {
            // ArithmeticException
            int result = 10 / 0;

            // ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);

            // NullPointerException
            String s = null;
            System.out.println(s.length());

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e);
        }
    }
}
