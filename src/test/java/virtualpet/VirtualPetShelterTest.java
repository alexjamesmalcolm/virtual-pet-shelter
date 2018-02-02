package virtualpet;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	
	private VirtualPetShelter petShelter;
	private VirtualPet tommy;
	private VirtualPet joey;

	@Before
	public void setup() {
		petShelter = new VirtualPetShelter();
		tommy = new VirtualPet("Tommy");
		joey = new VirtualPet("Joey");
	}

	@Test
	public void shouldAddVirtualPet() {
		petShelter.addPet(tommy);
		VirtualPet returnedPet = petShelter.getPet("Tommy");
		assertThat(returnedPet, is(tommy));
	}
	
	@Test
	public void shouldReturnAllPets() {
		petShelter.addPet(tommy);
		petShelter.addPet(joey);
		Collection<VirtualPet> pets = petShelter.pets();
		assertThat(pets, containsInAnyOrder(joey, tommy));
	}
	
	@Test
	public void shouldAdoptPet() {
		petShelter.addPet(tommy);
		petShelter.addPet(joey);
		petShelter.adoptPet(joey.getName());
		Collection<VirtualPet> pets = petShelter.pets();
		assertThat(pets, contains(tommy));
	}
}
