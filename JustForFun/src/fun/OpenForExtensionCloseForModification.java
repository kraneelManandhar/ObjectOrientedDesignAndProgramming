package fun;

public class OpenForExtensionCloseForModification {
    void drawCash(String method) {
        if (method.equals("Bank")) {
            System.out.println("Cash withdrawn from cashier");
        } else if (method.equals("ATM")) {
            System.out.println("Cash withdrawn from ATM");
        }
    }
}