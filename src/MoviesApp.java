import java.util.ArrayList;
import java.util.Scanner;

public class MoviesApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String input1 = "";
		String input2 = "";

		ArrayList<Movies> movies = new ArrayList<>();

		Movies mov1 = new Movies("Star Wars", "Scifi");
		Movies mov2 = new Movies("Bade Runner", "Scifi");
		Movies mov3 = new Movies("Outland", "Scifi");
		Movies mov4 = new Movies("Howls Moving Castle", "Animated");
		Movies mov5 = new Movies("Incredibles", "Animated");
		Movies mov6 = new Movies("Isle of Dogs", "Animated");
		Movies mov7 = new Movies("Taxi Driver", "Drama");
		Movies mov8 = new Movies("Apocalypse Now", "Drama");
		Movies mov9 = new Movies("Night of the Living Dead", "Horror");
		Movies mov10 = new Movies("Zombieland", "Horror");

		movies.add(mov1);
		movies.add(mov2);
		movies.add(mov3);
		movies.add(mov4);
		movies.add(mov5);
		movies.add(mov6);
		movies.add(mov7);
		movies.add(mov8);
		movies.add(mov9);
		movies.add(mov10);

		// for (Movies movi : movies) {
		// System.out.println(movi);
		// }

		System.out.println("Welcome to the Movie List Application!\n");
		System.out.println("There are 10 movies in the list.");

		boolean valid = false;
		do {
			System.out.println("Which category are you interested in?\n");
			System.out.print("Please choose from the following: \nAnimated, Drama, Horror, Scifi   >>");

			input1 = scnr.nextLine();
			System.out.println();

			for (int i = 0; i < movies.size(); i++) {
				if (movies.get(i).getMovieCategory().equalsIgnoreCase(input1)) {
					System.out.print(movies.get(i).getMovieTitle() + ", ");
					System.out.println(movies.get(i).getMovieCategory());
				}
			}

			int flag = 0;

			do {
				System.out.print("\nContinue (y/n)?: ");
				String userInput = scnr.nextLine();

				if (userInput.equalsIgnoreCase("y")) {
					flag = 1;
				} else if (userInput.equalsIgnoreCase("n")) {
					flag = 1;
					System.out.println("\nDone!");
					valid = true;
				} else if ((!userInput.equalsIgnoreCase("y")) || (!userInput.equalsIgnoreCase("n"))) {
					System.out.println("\nInvalid response. Please type \"y\" or \"n\".");
					continue;
				}
			} while (flag != 1);

			/*
			 * System.out.println("\nContinue? (y/n):"); input2 = scnr.nextLine();
			 * 
			 * if (input2.equalsIgnoreCase("n")) { System.out.println("Done!"); valid =
			 * true;
			 * 
			 * } else if (input2.equalsIgnoreCase("y")) { continue; }
			 */

		} while (!valid);

	}
}
