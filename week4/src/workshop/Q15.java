package workshop;

public class Q15 {
    static void methodA() throws Exception {
        System.out.println("Method A");
        methodB();
    }

    static void methodB() throws Exception {
        System.out.println("Method B");
        methodC();
    }

    static void methodC() throws Exception {
    	System.out.println("Method C");
        throw new Exception("Exception thrown in methodC");
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Handled in main: " + e.getMessage());
        }
    }
}