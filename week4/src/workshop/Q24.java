package workshop;

import java.io.File;
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

//        try {
        
            Scanner file = new Scanner(new File(filename));
            while (file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
            file.close();
            
            //Without this input handling the program would crash and the final end wouldn't be displayed
            
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found!");
//        }
            
           System.out.println("End of program");
    }
}
