
public class Driver {
public static void main(String[] args) {

	GamePieceAppearance one = new GamePieceAppearance(Color.RED, Shape.RACECAR);
	System.out.println(one.getColor());
	System.out.println(one.getShape());
	GamePiece two = GamePiece.BLUE_BOOT;
	System.out.println(two.toString());
	
	BoardGame three = new BoardGame();
	three.addPlayer("Man", GamePiece.RED_RACER, Location.HALL);
	three.addPlayer("Son", GamePiece.RED_THIMBLE, Location.STUDY);
	three.addPlayer("Bro", GamePiece.BLUE_BOOT, Location.LIBRARY);
	three.addPlayer("Dude", GamePiece.BLUE_RACER, Location.KITCHEN);
	three.addPlayer("Gal", GamePiece.MAGENTA_RACER, Location.DINING_ROOM);
	three.addPlayer("Chi", GamePiece.YELLOW_BOOT, Location.CONSERVATORY);

	
	
	//getters to test
	System.out.println(three.getPlayerGamePiece("Man"));
    System.out.println(three.getPlayerGamePiece("Man").getColor());			
    System.out.println(three.getPlayerGamePiece("Man").getShape());  
    System.out.println(three.getPlayerGamePiece("Man").getColor().getR());
    System.out.println(three.getPlayerGamePiece("Man").getColor().getG());	
    System.out.println(three.getPlayerGamePiece("Man").getColor().getB());

    System.out.println(three.getPlayerWithGamePiece(null));
	System.out.println(three.getPlayerWithGamePiece(GamePiece.RED_RACER));	
    three.movePlayer("Son", Location.BALLROOM);
    System.out.println(three.getPlayersLocation("Son"));
    
    System.out.println(three.getPlayersLocation("Bro"));
    System.out.println(three.getPlayersAtLocation(Location.HALL));
    System.out.println(three.getPlayersAtLocation(Location.KITCHEN));

    System.out.println(three.getGamePiecesAtLocation(Location.HALL));
    System.out.println(three.getPlayers());
    System.out.println(three.getPlayerLocations());
    System.out.println(three.getPlayerPieces());


    String[] list = new String[2];
    list[0] = "Man";
    list[1] = "Son";
    
    Location[] place = new Location[2];
    place[0] = Location.HALL;
    place[1] = Location.STUDY;
    
    System.out.println((three.moveTwoPlayers(list, place)).toString());
    
    String[] list22 = new String[2];
    list22[0] = "Gal";
    list22[1] = "Chi";
    
    Location[] places2 = new Location[2];
    places2[0] = Location.DINING_ROOM;
    places2[1] = Location.CONSERVATORY;
    
    System.out.println((three.moveTwoPlayers(list22, places2)).toString());



}
}

