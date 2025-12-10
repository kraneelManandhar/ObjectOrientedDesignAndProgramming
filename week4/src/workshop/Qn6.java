package workshop;
import java.util.Scanner;
import workshop.NegativeNumberException;

public class Qn6 {
	public static void verifyNumber(int num) throws NegativeNumberException {
        if (num < 0) {
        	System.out.println("Your number is "+ num);
            throw new NegativeNumberException();
        } else {
            System.out.println("Your number is: " + num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        try {
        	verifyNumber(num);
        }catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        	
        sc.close();
    }
	}
