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
	
	@Test
	public void moveTwoTest() {
		BoardGame one = new BoardGame();
		BoardGame two = new BoardGame();

		one.addPlayer("Dude", GamePiece.RED_RACER, Location.STUDY);
		one.addPlayer("Guy", GamePiece.YELLOW_BOOT, Location.LIBRARY);
		String[] list = new String[3];
		list[0] = "Dude";
		list[1] = "Guy";
		Location[] places = new Location[2];
		places[0] = Location.STUDY;
		places[1] = Location.LIBRARY;
		one.moveTwoPlayers(list, places);
		Assert.assertEquals(Location.STUDY, one.getPlayersLocation("Dude"));
		Assert.assertEquals(Location.LIBRARY, one.getPlayersLocation("Guy"));
		
		
		
		two.addPlayer("Man", GamePiece.MAGENTA_RACER, Location.BALLROOM);
		two.addPlayer("Gal", GamePiece.BLUE_BOOT, Location.HALL);
		String[] list2 = new String[2];
        list2[0] = "Man";
        list2[1] = "Gal";
        Location[] places2 = new Location[2];
        places2[0] = Location.BALLROOM;
        places2[1] = Location.HALL;
        two.moveTwoPlayers(list2, places2);
	    Assert.assertEquals(Location.BALLROOM, two.getPlayersLocation("Man"));
	    Assert.assertEquals(Location.HALL, two.getPlayersLocation("Gal"));
		
	}
	
	
	
	
	
	@Test
	public void getPlayersAtLocationTest() {
		BoardGame one = new BoardGame();
		one.addPlayer("New", GamePiece.GREEN_BOOT, Location.KITCHEN);
		one.addPlayer("HA", GamePiece.RED_THIMBLE, Location.KITCHEN);
		ArrayList<String> list = new ArrayList<String>();
		list.add("New");
		list.add("HA");
    	Assert.assertEquals(list, one.getPlayersAtLocation(Location.KITCHEN));      	
    	Assert.assertEquals(list, one.getPlayersAtLocation(Location.KITCHEN));
    	list.clear();
    	Assert.assertEquals(list, one.getPlayersAtLocation(Location.STUDY));

	}
	
	
	@Test
	public void getGamePiecesAtLocationTest() {
		BoardGame one = new BoardGame();
		one.addPlayer("Man", GamePiece.RED_RACER, Location.KITCHEN);
		one.addPlayer("Bro", GamePiece.MAGENTA_RACER, Location.KITCHEN);   	
    	ArrayList<GamePiece> pieces = new ArrayList<GamePiece>();
    	pieces.add(GamePiece.RED_RACER);
    	pieces.add(GamePiece.MAGENTA_RACER);
    	Assert.assertEquals(pieces, one.getGamePiecesAtLocation(Location.KITCHEN));
	}
	
	
	
	
	@Test
	public void getPlayersTest() {
		BoardGame one = new BoardGame();
		one.addPlayer("Man", GamePiece.RED_RACER, Location.HALL);
		one.addPlayer("Guy", GamePiece.MAGENTA_RACER, Location.STUDY);
		one.addPlayer("Bro", GamePiece.BLUE_RACER, Location.HALL);
		one.addPlayer("Pal", GamePiece.GREEN_BOOT, Location.STUDY);  	
    	Set<String> list = new HashSet<String>();
    	list.add("Man");
    	list.add("Guy");
    	list.add("Bro");
    	list.add("Pal");   	
    	Assert.assertEquals(list, one.getPlayers());
    	
	}
	
	
	@Test
	public void getPlayerLocationsTest() {
		BoardGame one = new BoardGame();
		one.addPlayer("Man", GamePiece.RED_RACER, Location.HALL);
		one.addPlayer("Guy", GamePiece.MAGENTA_RACER, Location.STUDY);
		one.addPlayer("Bro", GamePiece.BLUE_RACER, Location.HALL);
		one.addPlayer("Pal", GamePiece.GREEN_BOOT, Location.STUDY);  
		Set<Location> list = new HashSet<Location>();
    	list.add(Location.HALL);
    	list.add(Location.STUDY);
    	list.add(Location.HALL);
    	list.add(Location.STUDY); 
    	Assert.assertEquals(list, one.getPlayerLocations());
	}
	
	
	
	@Test
	public void getPlayerPiecesTest() {
		BoardGame one = new BoardGame();
		one.addPlayer("Man", GamePiece.RED_RACER, Location.HALL);
		one.addPlayer("Guy", GamePiece.MAGENTA_RACER, Location.STUDY);
		one.addPlayer("Bro", GamePiece.BLUE_RACER, Location.HALL);
		one.addPlayer("Pal", GamePiece.GREEN_BOOT, Location.STUDY);  
		Set<GamePiece> list = new HashSet<GamePiece>();
    	list.add(GamePiece.RED_RACER);
    	list.add(GamePiece.MAGENTA_RACER);
    	list.add(GamePiece.BLUE_RACER);
    	list.add(GamePiece.GREEN_BOOT); 
    	Assert.assertEquals(list, one.getPlayerPieces());
		
	}
}
