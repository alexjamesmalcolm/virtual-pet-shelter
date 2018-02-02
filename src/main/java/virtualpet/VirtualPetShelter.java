package virtualpet;

public class VirtualPetShelter {

	private VirtualPet pet;

	public void addPet(VirtualPet pet) {
		this.pet = pet;
	}

	public VirtualPet getPet(String name) {
		return pet;
	}

}
