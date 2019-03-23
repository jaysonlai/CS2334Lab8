
public class GamePiece {
enum gamePiece{
	RED_RACER,
	BLUE_RACER,
	MAGENTA_RACER,
	RED_THIMBLE,
	BLUE_BOOT,
	GREEN_BOOT,
	YELLOW_BOOT;
}

private GamePieceAppearance appearance;
private int priority;

private GamePiece(GamePieceAppearance appearance, int priority) {
	this.appearance = appearance;
	this.priority = priority;
	
}

public Color getColor() {
	return this.getColor();
}

public Shape getShape() {
	return this.getShape();
}

public GamePiece movesFirst(GamePiece a, GamePiece b) {
	if(a.priority > b.priority) {
		return b;
	}
	else if(b.priority > a.priority) {
		return a;
	}
	else return a;
	
}

@Override
public String toString() {
	return "GamePiece [appearance=" + appearance + ", priority=" + priority + "]";
}

}
