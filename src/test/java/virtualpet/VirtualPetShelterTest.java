package virtualpet;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class VirtualPetShelterTest {

	@Test
	public void shouldAddVirtualPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet = new VirtualPet("Tommy");
		underTest.addPet(pet);
		VirtualPet returnedPet = underTest.getPet("Tommy");
		assertThat(returnedPet, is(pet));
	}
}
