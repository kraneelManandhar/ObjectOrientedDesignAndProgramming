package workshop;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Qn5 {
	public static void main(String[] args) {
		//Unchecked exception
		
				try {
		            System.out.println(7 / 0);  // Arithmetic Exception
		        } catch (ArithmeticException e) {
		            System.out.println("Arithmetic Error: " + e.getMessage());
		        }catch (Exception e) {
		            System.out.println("Exception: " + e.getMessage());
		        }
				
				try {
		            String s = null;
		            System.out.println(s.length()); // NullPointerException
		        } catch (Exception e) {
		            System.out.println("Caught general Exception: " + e);
		        }
				
				try {
					int arr[] = {1,2,3,4}; 
					System.out.println(arr[6]);
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Caught general Exception: " + e);
				}
				
				//Checked Exception
				 try {
			            // Opening a file that does NOT exist
			            File file = new File("hello.txt");
			            FileReader fr = new FileReader(file);

			            System.out.println("File opened successfully!");
			            fr.close();

			        } catch (IOException e) {
			            System.out.println("IOException caught: " + e.getMessage());
			        }
				
	}
}
