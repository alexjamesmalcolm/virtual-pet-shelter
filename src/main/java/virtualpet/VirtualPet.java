package virtualpet;

public class VirtualPet {

	private String name;

	public VirtualPet(String name, String description) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "VirtualPet {name: " + name + "}";
	}

	public String getDescription() {
		return "Boy this one stinks";
	}

}
