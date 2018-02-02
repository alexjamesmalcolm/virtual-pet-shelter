package virtualpet;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetTest {

	private static final int HUNGER_PER_TICK = VirtualPet.HUNGER_PER_TICK;
	private static final int THIRST_PER_TICK = VirtualPet.THIRST_PER_TICK;
	private static final int BOREDOM_PER_TICK = VirtualPet.BOREDOM_PER_TICK;
	private static final int HUNGER_TO_THIRST = VirtualPet.HUNGER_TO_THIRST;
	private static final int DEFAULT_HUNGER = VirtualPet.DEFAULT_HUNGER;
	private static final int DEFAULT_THIRST = VirtualPet.DEFAULT_THIRST;
	private VirtualPet tommy;
	private VirtualPet joey;

	@Before
	public void setup() {
		tommy = new VirtualPet("Tommy", "Boy this one stinks", 50, 50, 50);
		joey = new VirtualPet("Joey", "That's one cool pet");
	}

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

	@Test
	public void shouldFeedPet() {
		VirtualPet underTest = new VirtualPet("Tommy", "Boy this one stinks", 50, 0, 0);
		underTest.feed();
		int hunger = underTest.getHunger();
		assertThat(hunger, is(0));
	}

	@Test
	public void shouldWaterPet() {
		VirtualPet underTest = new VirtualPet("Tommy", "Boy this one stinks", 0, 50, 0);
		underTest.water();
		int thirst = underTest.getThirst();
		assertThat(thirst, is(0));
	}

	@Test
	public void shouldPlayWithPet() {
		VirtualPet underTest = new VirtualPet("Tommy", "Boy this one stinks", 0, 0, 50);
		underTest.play();
		int boredom = underTest.getBoredom();
		assertThat(boredom, is(0));
	}

	@Test
	public void shouldHaveTickIncreaseHunger() {
		tommy.tick();
		int hunger = tommy.getHunger();
		assertThat(hunger, is(50 + HUNGER_PER_TICK));
	}

	@Test
	public void shouldHaveTickIncreaseThirst() {
		tommy.tick();
		int thirst = tommy.getThirst();
		assertThat(thirst, is(50 + THIRST_PER_TICK));
	}

	@Test
	public void shouldHaveTickIncreaseBoredom() {
		tommy.tick();
		int boredom = tommy.getBoredom();
		assertThat(boredom, is(50 + BOREDOM_PER_TICK));
	}

	@Test
	public void shouldHaveFeedIncreaseThirst() {
		tommy.feed();
		int thirst = tommy.getThirst();
		assertThat(thirst, is(50 + 50 / HUNGER_TO_THIRST));
	}
	
	@Test
	public void shouldHaveDefaultHunger() {
		int hunger = joey.getHunger();
		assertThat(hunger, is(DEFAULT_HUNGER));
	}
	
	@Test
	public void shouldHaveDefaultThirst() {
		int thirst = joey.getThirst();
		assertThat(thirst, is(DEFAULT_THIRST));
	}
	
	@Test
	public void shouldHaveDefaultBoredom() {
		int boredom = joey.getBoredom();
		assertThat(boredom, is(DEFAULT_BOREDOM));
	}
}
