import java.util.Scanner;

public class Intro {

	public void introduction() {

		System.out.println("You awaken to find yourself in a barren moor!");
		System.out.println("Try 'Look' to scout out your surroundings ");

		Scanner sc = new Scanner(System.in);

		String lookInput = sc.next();

		if (lookInput.equals("Look")) {

			System.out.println(
					"Grey foggy clouds float oppressively close to you, they are reflected in the murky grey water which reaches up your shins. Some black plants barely poke out of the shallow water.");

		} else {
			System.out.println("Please Try again");
		}

		System.out.println("Try 'North', 'South', 'East' or 'West' to navigate the swap and find your way out!");

		String direction = sc.next();

		// I really should have used a switch here

		if (direction.equals("North")) {

			System.out.println(
					"You notice a small watch-like device in your left hand. It has hands like a watch, but the hands don't seem to tell time.");
		} else if (direction.equals("East")) {

			System.out.println(
					"You notice a small watch-like device in your left hand. It has hands like a watch, but the hands don't seem to tell time.");
		} else if (direction.equals("South")) {

			System.out.println(
					"You notice a small watch-like device in your left hand. It has hands like a watch, but the hands don't seem to tell time.");
		} else if (direction.equals("West")) {

			System.out.println(
					"You notice a small watch-like device in your left hand. It has hands like a watch, but the hands don't seem to tell time.");

		} else {
			System.out.println("Please Try again");
		}

		System.out.println("The dial reads 5.0m, let's try moving again to see if the reading changes?");

		System.out.println(
				"Use the keys A (West), W (North), D (East) and S (South) to move your player (P). I wonder what the question mark means on the map? I see something shiny in the distance");

	}

}
