import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.Assert;
public class GamePieceTest {

	@Test
	public void getTest() {
		GamePiece one = GamePiece.RED_RACER;
		GamePiece two = GamePiece.BLUE_BOOT;
		Assert.assertEquals(Color.RED, one.getColor());
	    Assert.assertEquals(Color.BLUE, two.getColor());	
	    Assert.assertEquals(Shape.RACECAR, one.getShape());
	    Assert.assertEquals(Shape.BOOT, two.getShape());	
	}
	
	@Test
	public void movesFirstTest() {
		GamePiece one = GamePiece.RED_RACER;
		GamePiece two = GamePiece.BLUE_BOOT;		
		Assert.assertEquals(one, GamePiece.movesFirst(one, two));
		Assert.assertEquals(one, GamePiece.movesFirst(two, one));
	}
	
	@Test
	public void toStringTest() {
		GamePiece one = GamePiece.RED_THIMBLE;
		Assert.assertEquals("RED_THIMBLE: a RED thimble with priority 10", one.toString());
	}

}
