package workshop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        try {
            Scanner file = new Scanner(new File(filename));
            while (file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
