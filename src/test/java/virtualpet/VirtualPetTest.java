package virtualpet;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualPetTest {
	
	@Test
	public void shouldHaveDescription() {
		VirtualPet underTest = new VirtualPet("Tommy", "Boy this one stinks");
		String description = underTest.getDescription();
		assertThat(description, is("Boy this one stinks"));
	}
	
	@Test
	public void shouldHaveDifferentDescription() {
		VirtualPet underTest = new VirtualPet("Joey", "That's one cool pet");
		String description = underTest.getDescription();
		assertThat(description,  is("That's one cool pet"));
	}
}
