package virtualpet;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {
	
	@Test
	public void shouldHaveDescription() {
		VirtualPet underTest = new VirtualPet("Tommy", "Boy this one stinks");
		String description = underTest.getDescription();
		Assert.assertThat(description, Matchers.is("Boy this one stinks"));
	}
}
