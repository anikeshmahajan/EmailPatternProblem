package emailSampleValidation;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
	  RegexValidation regexValidation = new RegexValidation();
      Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the first EmailSample");
		String emailIdSample1= scanner.nextLine();
		regexValidation.emailIdValidator1(emailIdSample1);
		System.out.println("<---------------->");
		
		System.out.println("Enter the second EmailSample");
		String emailIdSample2= scanner.nextLine();
		regexValidation.emailIdValidator2(emailIdSample2);
		System.out.println("<---------------->");
		

		System.out.println("Enter the third EmailSample");
		String emailIdSample3= scanner.nextLine();
		regexValidation.emailIdValidator3(emailIdSample3);
		System.out.println("<---------------->");
		

		System.out.println("Enter the fourth EmailSample");
		String emailIdSample4= scanner.nextLine();
		regexValidation.emailIdValidator4(emailIdSample4);
		System.out.println("<---------------->");
		

		System.out.println("Enter the fifth EmailSample");
		String emailIdSample5= scanner.nextLine();
		regexValidation.emailIdValidator0(emailIdSample5);
		System.out.println("<---------------->");
		

		System.out.println("Enter the sixth EmailSample");
		String emailIdSample6= scanner.nextLine();
		regexValidation.emailIdValidator5(emailIdSample6);
		System.out.println("<---------------->");
		

		System.out.println("Enter the seventh EmailSample");
		String emailIdSample7= scanner.nextLine();
		regexValidation.emailIdValidator6(emailIdSample7);
		System.out.println("<---------------->");
		

		System.out.println("Enter the 8th EmailSample");
		String emailIdSample8= scanner.nextLine();
		regexValidation.emailIdValidator7(emailIdSample8);
		System.out.println("<---------------->");
		
		System.out.println("Enter the 9th EmailSample");
		String emailIdSample9= scanner.nextLine();
		regexValidation.emailIdValidator8(emailIdSample9);
		
		
	}

}
