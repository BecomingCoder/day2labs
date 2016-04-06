package day2Labs;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome! What is your name?");
		String name = sc.nextLine();
		System.out.println("Would you like to play the game? yes or no");

		boolean stop = false;
		int state = 1;
		while (!stop)
			switch (state) {
			case 1:
				String input = sc.next();
				if (input.equals("yes")) {
					state = 2;
				}

				else {
					System.out.println("Game is OVER!!");
					stop = true;
				}

			case 2:
				System.out.println("You see a dragon, what will you do?  Will you face the beast?");
				String reply = sc.next();
				if (reply.equals("yes")) {
					state = 3;
				} else {
					System.out.println("Weakling! You fall into a lavapit and burn like the worm you are!");
					stop = true;
				}

			case 3:
				System.out.println(
						"You approach the dragon.  You see that he has __ heads. Enter \"2\" or \"3\" or \"4\"");
				String heads = sc.next();
				System.out.println("No one has ever faced a " + heads
						+ "-headed dragon before!  Choose your weapon. \n (Enter \"slingshot\" or \"sword\" or \"gun\"");
				String weapons = sc.next();

			}
		sc.close();
	}
}
