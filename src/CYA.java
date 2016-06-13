
// Eric Price
// 06/06/2016
// A choose your own adventure game

import java.io.Console;
import java.util.Scanner;

public class CYA {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("What is your name? ");
		String name = input.next();
		// System.out.print("Are you ready to play? ");
		// String confirm = input.next();

		System.out.print("What is your age? ");
		int age = input.nextInt();
		if (age > 12) {
			System.out.println("\nYou're old enough to play! " + " Let's start the adventure!");
		} else {
			System.out.println("You're underage! Play at your own risk.");

		}
		String loop = "begin";
		String fight = "y";
		do {
			System.out.println("\nPress enter to begin");
			input.nextLine();
			String pause = input.nextLine();
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("-----------------------------------------");
			System.out.println("You are traveling at 99.9% the speed of light, in a "
					+ "spaceship, through a wormhole in spacetime. \n\nSuddenly, you" + " see a dragon!");
			System.out.println("\nDo you 'fight' or 'run'");
			do {
				fight = input.next();

				if (fight.equalsIgnoreCase("fight")) {
					System.out.println("What do you want to use 'nukes', 'lasers', 'rock'");
					String tools = input.next();

					if (tools.equalsIgnoreCase("nukes")) {
						System.out.println("You fire 1,000 nukes.\nDirect hit!\nThe dragon "
								+ "is angry.\n\nShe uses her fire-attack to burn up your "
								+ "superfast cardboard spaceship!\nYou die.\n\nTry again");
					} else if (tools.equalsIgnoreCase("lasers")) {
						System.out.println("Direct Hit" + "\nThe laser was super-effective!"
								+ "\nThe dragon dies and you arrive at White Castle" + "\nGreat Job " + name
								+ ", but the food kills you anyway." + "\n\nLife is hard.  No one makes it out alive."
								+ "\nGame OOOOVer" + "\nPress enter to play again");
					} else {
						System.out.println("\nPaper. \nYou're dead." + "\nTry again");

					}

				} else {
					System.out.println("You can't run away in a wormhole.\n\nYou bump into "
							+ "the side and are completely de-atomized");
					System.out.println("you die. \n\nTry again.");
				}
			} while (fight.equalsIgnoreCase("n"));
		} while (loop.equalsIgnoreCase("begin"));
		System.out.println("\ngame over");
		input.close();
	}
}
