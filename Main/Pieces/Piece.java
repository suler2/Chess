package Pieces;

abstract class Piece {
	public static final int EMPTY = 0;

    public static final int nPieceTypes = 13;

	public Piece () {
	}

	abstract void move ();
	abstract boolean isAlive ();
	abstract int[] position();
	abstract int value ();
}
