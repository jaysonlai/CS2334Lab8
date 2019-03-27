import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {

	@Test
	public void testShapeToString() {
		Shape one = null;
		Assert.assertEquals("thimble", one.THIMBLE.toString());
		Assert.assertEquals("racecar", one.RACECAR.toString());
		Assert.assertEquals("boot", one.BOOT.toString());

	}

}
