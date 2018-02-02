package virtualpet;

public class VirtualPet {

	private String name;

	public VirtualPet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "VirtualPet {name: " + name + "}";
	}

}
