package virtualpet;

public class VirtualPet {

	public static final int HUNGER_PER_TICK = 1;
	public static final int THIRST_PER_TICK = 1;
	private String name;
	private String description;
	private int hunger;
	private int thirst;
	private int boredom;

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
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
		return boredom;
	}

	public void feed() {
		hunger = 0;
	}

	public void water() {
		thirst = 0;
	}

	public void play() {
		boredom = 0;
	}

	public void tick() {
		hunger += HUNGER_PER_TICK;
		thirst += THIRST_PER_TICK;
	}

}
