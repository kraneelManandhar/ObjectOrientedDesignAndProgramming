package workshop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q25 {
	    // declares method may throw exception
	    static void readFile(String filename) throws FileNotFoundException {
	        Scanner file = new Scanner(new File(filename));
	        System.out.println("File opened: " + filename);
	        file.close();
	    }

	    // actually throws exception
	    static void checkNumber(int num) {
	        if (num < 0) {
	            throw new IllegalArgumentException("Number cannot be negative!");
	        }
	        System.out.println("Number is valid: " + num);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        try {
	            checkNumber(num);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }

	        System.out.print("Enter filename: ");
	        sc.nextLine();
//	        System.out.println(sc.nextLine());
	        String filename = sc.nextLine();
	        try {
	            readFile(filename);
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found!");
	        }
	        sc.close();
	    }
	}