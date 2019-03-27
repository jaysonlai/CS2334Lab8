import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest {

	@Test
	public void addPlayerTest() {
		BoardGame one = new BoardGame();
		Assert.assertEquals(true, one.addPlayer("Dude", GamePiece.RED_RACER, Location.HALL));
		Assert.assertEquals(false, one.addPlayer("Dude", GamePiece.BLUE_BOOT, Location.STUDY));

	}
	
	
	@Test
	public void getPlayerGamePieceTest() {
		BoardGame one = new BoardGame();
		Assert.assertEquals(true, one.addPlayer("Dude", GamePiece.RED_RACER, Location.HALL));
		Assert.assertEquals(GamePiece.RED_RACER, one.getPlayerGamePiece("Dude"));
	}

	@Test
	public void getPlayerWithGamePieceTest() {
		BoardGame one = new BoardGame();
		Assert.assertEquals(true, one.addPlayer("Dude", GamePiece.RED_RACER, Location.HALL));
		Assert.assertEquals("Dude", one.getPlayerWithGamePiece(GamePiece.RED_RACER));
		Assert.assertEquals(null, one.getPlayerWithGamePiece(GamePiece.GREEN_BOOT));
	}
	
	
	@Test
	public void movePlayerTest() {
		BoardGame one = new BoardGame();
		one.addPlayer("Dude",GamePiece.RED_THIMBLE, Location.LOUNGE);
		one.movePlayer("Dude", Location.STUDY);
		Assert.assertEquals(Location.STUDY, one.getPlayersLocation("Dude"));
	}
}
