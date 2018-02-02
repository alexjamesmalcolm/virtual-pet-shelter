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
		assertThat(description, is("That's one cool pet"));
	}

	@Test
	public void shouldHaveHunger() {
		VirtualPet underTest = new VirtualPet("Tommy", "Boy this one stinks", 50, 0, 0);
		int hunger = underTest.getHunger();
		assertThat(hunger, is(50));
	}
	
	@Test
	public void shouldHaveThirst() {
		VirtualPet underTest = new VirtualPet("Tommy", "Boy this one stinks", 0, 50, 0);
		int thirst = underTest.getThirst();
		assertThat(thirst, is(50));
	}
	
	@Test
	public void shouldHaveBoredom() {
		VirtualPet underTest = new VirtualPet("Tommy", "Boy this one stinks", 0, 0, 50);
		int boredom = underTest.getBoredom();
		assertThat(boredom, is(50));
	}
}
