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

}
