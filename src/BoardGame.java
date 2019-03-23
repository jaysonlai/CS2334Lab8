import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoardGame {
	
	/*
	 * Each player is associated with a unique game piece (i.e.
	 */
	protected  LinkedHashMap<String, GamePiece> playerPieces() {
		
		
	}
	/*
	 * Each player places their game piece at a location on the board, 
	 * as defined by the Location enum.
	 */
	protected LinkedHashMap<String, Location> playerLocations() {
		
	}
	
	//BoardGame constructor.
	public BoardGame() {
		
	}
	
	
	
	//public methods below
	
	
	/*
	 * Adds a player to the board game object.
	 */
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
		
	}
	/*
	 * Given a player's name, find the game piece associated with that player.
	 */
	public GamePiece getPlayerGamePiece(String playerName) {
		return playerPieces().get(playerName);
		
	}
	
	
	/*
	 * Given a game piece, find the player associated with that game piece.
	 */
	public String getPlayerWithGamePiece(GamePiece gamePiece) {
		String here = "";
		for (String name : playerPieces().keySet())  {
			if(playerPieces().get(name)==gamePiece) {
				here=name;
			}
		}
		return here;
			}

	
	
	/*
	 * Moves a player to a new location in the board game.
	 */
	public void movePlayer(String playerName, Location newLocation) {
		
		playerLocations().put(playerName, newLocation);
			}
	
	
	
	/*
	 * Method to use when two players each want to move at the same time.
	 */
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations) {
		
	}
	
	
	/*
	 * Gets the location of a player.
	 */
	public Location getPlayersLocation(String player) {
		return playerLocations().get(player);
	}
	
	
	/*
	 * Given a location, find all players at that location.
	 */
	public ArrayList<String> getPlayersAtLocation(Location loc) {
	
	}
	
	//Given a location
	//find the game pieces associated with all the players at that location.
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc) {
		
	}
	
	
	/*
	 * Gets all players recorded in the game.
	 */
	public Set<String> getPlayers() {
		Set<String>keys = playerPieces().keySet();
		return keys;	
	}
	
	
	/*
	 * Gets all locations that the players are at (not all possible locations).
	 */
	public Set<Location> getPlayerLocations() {
		Set<GamePiece>pieces = new HashSet<GamePiece>();

		
	}
	
	
	/*
	 * Gets all game pieces associated with the players (not all possible game pieces).
	 */
	public Set<GamePiece> getPlayerPieces() {
		Set<GamePiece>pieces = new HashSet<GamePiece>();
		for (GamePiece piece: playerPieces().values()) {
        	   pieces.add(piece);
    } 
		
		return pieces;
	}
}
