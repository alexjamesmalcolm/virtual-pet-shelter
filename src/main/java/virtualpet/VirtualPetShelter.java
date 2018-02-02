package virtualpet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void addPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	public VirtualPet getPet(String name) {
		return pets.get(name);
	}

	public Collection<VirtualPet> pets() {
		return pets.values();
	}

	public void adoptPet(String name) {
		pets.remove(name);
	}

	public void feed() {
		pets.forEach((name, pet) -> pet.feed());
	}

	public void water() {
		pets.forEach((name, pet) -> pet.water());
	}

	public void play(String name) {
		getPet(name).play();
	}

	public void tick() {
		pets.forEach((name, pet) -> pet.tick());
	}
	
	@Override
	public String toString() {
		String line1 = "Name\t|Hunger\t|Thirst\t|Boredom\n";
		String line2 = "--------|-------|-------|-------\n";
		String line3 = "Joey\t|50\t|50\t|50\n";
		String line4 = "Tommy\t|50\t|50\t|50";
		String message = line1 + line2 + line3 + line4;
		return message;
	}

}
