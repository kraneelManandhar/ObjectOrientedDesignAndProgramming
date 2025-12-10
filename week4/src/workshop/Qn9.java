package workshop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Qn9 {

    static void checkNumber(int n) {
        if (n < 0) {
            throw new ArithmeticException("Negative number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                checkNumber(num);
                System.out.println("You entered: " + num);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e.getMessage());
            }catch(InputMismatchException e) {
            	System.out.println("Are you dumb??");
            }catch(Exception e) {
            	System.out.println(e.getMessage());
            }
        }
}