package Demo;
import java.util.*;
public class ifstatement {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

	        if (age >= 18) {
	            System.out.println("You are eligible to vote.");
	        } else {
	            System.out.println("You are not eligible to vote.");
	        }
	        scanner.close();
	    }
	}
