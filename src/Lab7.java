import java.util.Scanner; //Jonah Wooten & Tim Pieniazek
import java.util.regex.Matcher; //https://github.com/Jonah-Wooten
import java.util.regex.Pattern; //jonahwooten92@gmail.com

public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// input Scanner
		Scanner scan = new Scanner(System.in);

		// Created Method to scan for name
		System.out.println("Please Enter a Valid Name");
		String name = scan.nextLine();
		validateName(name);

		// Created Method to scan for email
		System.out.println("Plese enter a valid email:");
		String email = scan.nextLine();
		validateEmail(email);

		// Created Method to scan for phone number
		System.out.println("Please enter a valid phone number");
		String phoneNumber = scan.nextLine();
		validatePhoneNumber(phoneNumber);

		// Created Method to scan for date
		System.out.println("Please enter a valid date");
		String date = scan.nextLine();
		validateDate(date);

		// Say Goodbye and close scan
		System.out.println("Goodbye");
		scan.close();
	}

	public static void validateName(String name) {

		// p save our pattern, means not a letter a to z or A to Z
		Pattern p = Pattern.compile("a-zA-Z");
		// m matches our pattern to the string inputted
		Matcher m = p.matcher(name);
		// find any matches true or false
		if (m.find()) {
			System.out.println("Sorry name is not valid");
		} else {
			System.out.println("Name is valid!");
		}
	}

	public static void validateEmail(String email) {

		// Word @ Word . Word 2-4
		Pattern p = Pattern.compile("\\w+@\\w+\\.\\w{2,4}");

		// m matches our pattern to the string inputted
		Matcher m = p.matcher(email);

		// find any matches true or false
		if (m.find()) {
			System.out.println("Email is valid");
		} else {
			System.out.println("Email is not valid !");
		}
	}

	public static void validatePhoneNumber(String phoneNumber) {

		// 3 digits - 3 digits - 4digits
		Pattern p = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");

		// m matches our pattern to the string inputted
		Matcher m = p.matcher(phoneNumber);

		// find any matches true or false
		if (m.find()) {
			System.out.println("Phone number is valid");
		} else {
			System.out.println("Phone number is not valid !");
		}
	}

	public static void validateDate(String date) {

		// 3 digits - 3 digits - 4digits
		Pattern p = Pattern.compile("\\d{2}\\/\\d{2}\\/\\d{4}");

		// m matches our pattern to the string inputted
		Matcher m = p.matcher(date);

		// find any matches true or false
		if (m.find()) {
			System.out.println("Date is valid");
		} else {
			System.out.println("Date is not valid !");
		}
	}

}
