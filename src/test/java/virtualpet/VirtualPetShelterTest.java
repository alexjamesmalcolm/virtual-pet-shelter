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
		tommy = new VirtualPet("Tommy", "Boy this one stinks");
		joey = new VirtualPet("Joey", "That's one cool pet");
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
	
	@Test
	public void shouldHaveFeedFeedPet() {
		petShelter.addPet(tommy);
		petShelter.feed();
		int hunger = petShelter.getPet("Tommy").getHunger();
		assertThat(hunger, is(0));
	}
	
	@Test
	public void shouldHaveWaterWaterPet() {
		petShelter.addPet(tommy);
		petShelter.water();
		int thirst = petShelter.getPet("Tommy").getThirst();
		assertThat(thirst, is(0));
	}
}
