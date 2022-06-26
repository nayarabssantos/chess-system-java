package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	//only can e accessed by same package or subclasses 
	protected Board getBoard() {
		return board;
	}
	
	
}
