import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;
public class GamePieceAppearanceTest {

	@Test
	public void getTest() {
		GamePieceAppearance one = new GamePieceAppearance(Color.RED, Shape.RACECAR);
		Assert.assertEquals(Color.RED, one.getColor());
		Assert.assertEquals(Shape.RACECAR, one.getShape());
	}

}
