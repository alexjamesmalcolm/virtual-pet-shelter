package virtualpet;

public class VirtualPet {

	private String name;
	private String description;
	private int hunger;
	private int thirst;

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
		this.hunger = hunger;
		this.thirst = thirst;
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
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return 50;
	}

	public void feed() {
		hunger = 0;
	}

	public void water() {
		thirst = 0;
	}

}
