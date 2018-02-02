package virtualpet;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter shelter = new VirtualPetShelter();
		while (true) {
			System.out.println(shelter.toString());
			String line1 = "Name\t|Hunger\t|Thirst\t|Boredom\n";
			String line2 = "--------|-------|-------|-------\n";
			String line3 = "Joey\t|hunger\t|thirst\t|boredom\n";
			String line4 = "Tommy\t|hunger\t|thirst\t|boredom";
			String message = line1 + line2 + line3 + line4;
			System.out.println(message);
			/*
			 * String choice = input.next(); if (choice.equals("1")) { shelter.feed();
			 * System.out.println("You've feed all the pets"); } else if
			 * (choice.equals("2")) { shelter.water();
			 * System.out.println("You've refilled all the pets water dishes"); } else if
			 * (choice.equals("3")) { // TODO Play with a pet } else if (choice.equals("4"))
			 * { // TODO Adopt a pet } else if (choice.equals("5")) { // TODO Admit a pet }
			 * else if (choice.equals("6")) { break; }
			 */
			break;
		}
		input.close();
	}

}
