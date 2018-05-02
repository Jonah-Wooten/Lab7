import java.util.Scanner;

//I am still working on this
public class Lab8 {
	// Parallel Arrays -2 arrays that have the same length and the index location

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] arr = new int[3][3];

		String[][] ray = { { "Jonah", "Lives in Detroit", "Loves Nachos" }, { "Jeff", "Lives in L.A,", "Loves Pizza" },
				{ "Bob", "Lives in Chicage", "Loves HotDogs", "Dennis", "Lives in New York", "Loves Chineses Food" } };

		System.out.println("Please Enter a number between 1-3");

		int a = scan.nextInt() - 1;
		System.out.println(ray[a][0]);
		System.out.println("What would you like to know about him");
		System.out.println("Enter 1 for Location or 2 for Food");
		int b = scan.nextInt() - 1;
		if (a <= b)
			;
		System.out.println(ray[a][b]);

	}

}
