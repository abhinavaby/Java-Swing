package adadda;
import java.util.Scanner; 

public class wfgsyf {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter first number: ");
			 int n1 = scanner.nextInt();
			 System.out.print("Enter second number: ");
			 int n2 = scanner.nextInt();
			 System.out.print("division = "+(n1/n2));
			 
		}
		catch(Exception e) {
			System.out.print(e);
			
			
			
		}
		finally {
			System.out.print("\nend");
			
		}
	}

}
