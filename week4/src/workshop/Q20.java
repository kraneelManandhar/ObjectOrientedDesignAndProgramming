package workshop;

public class Q20 {
	static void add() throws Exception {
        try {
            throw new NullPointerException("String was null");
        } catch (NullPointerException e) {
            throw new Exception("Failed to add", e);
        }
    }

    public static void main(String[] args) {
        try {
            add();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
}
}