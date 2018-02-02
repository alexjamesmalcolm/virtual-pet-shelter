package virtualpet;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter shelter = new VirtualPetShelter();
		while (true) {
			System.out.println("This is the status of your pets:\n");
			System.out.println(shelter.toString());
			System.out.println("What would you like to do next?\n" + "\n" + "1. Feed the pets\n" + "2. Water the pets\n"
					+ "3. Play with a pet\n" + "4. Adopt a pet\n" + "5. Admit a pet\n" + "6. Quit");
			String choice = input.next();
			if (choice.equals("1")) {
				shelter.feed();
				System.out.println("You've feed all the pets");
			} else if (choice.equals("2")) {
				shelter.water();
				System.out.println("You've refilled all the pets water dishes");
			} else if (choice.equals("3")) {
				System.out.println("Which pet would you like to play with?");
				System.out.println(shelter.getNames());
				String name = input.next();
				shelter.play(name);
				System.out.println("You've played with " + name);
			} else if (choice.equals("4")) {
				System.out.println("Which pet would you like to adopt?");
				System.out.println(shelter.getNames());
				String name = input.next();
				shelter.adoptPet(name);
				System.out.println("You've adopted " + name);
			} else if (choice.equals("5")) {
				System.out.println("What's the name of the pet you're admitting?");
				String name = input.next();
				System.out.println("What's the description of the pet you're admitting?");
				String description = input.next();
				shelter.addPet(new VirtualPet(name, description));
			} else if (choice.equals("6")) {
				break;
			}
		}
		input.close();
	}
}
