package virtualpet;

public class VirtualPet {

	private String name;
	private String description;

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "VirtualPet {name: " + name + "}";
	}

	public String getDescription() {
		return description;
	}

	public int getHunger() {
		return 50;
	}

	public int getThirst() {
		return 50;
	}

	public int getBoredom() {
		return 50;
	}

}
