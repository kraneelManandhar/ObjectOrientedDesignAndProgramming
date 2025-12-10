package workshop;

public class Q14 {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;
            int[] arr = new int[3];
            System.out.println(arr[5]); 

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

    }
}
