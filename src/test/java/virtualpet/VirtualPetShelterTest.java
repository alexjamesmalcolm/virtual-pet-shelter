package virtualpet;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	
	private VirtualPetShelter underTest;
	private VirtualPet tommy;

	@Before
	public void setup() {
		underTest = new VirtualPetShelter();
		tommy = new VirtualPet("Tommy");
	}

	@Test
	public void shouldAddVirtualPet() {
		underTest.addPet(tommy);
		VirtualPet returnedPet = underTest.getPet("Tommy");
		assertThat(returnedPet, is(tommy));
	}
	
	@Test
	public void shouldReturnAllPets() {
	}
}
