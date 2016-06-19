package Main;

abstract class Piece {
	private static final int EMPTY = 0;

    private static final int WKING = 1;
    private static final int WQUEEN = 2;
    private static final int WROOK = 3;
    private static final int WBISHOP = 4;
    private static final int WKNIGHT = 5;
    private static final int WPAWN = 6;

    private static final int BKING = 7;
    private static final int BQUEEN = 8;
    private static final int BROOK = 9;
    private static final int BBISHOP = 10;
    private static final int BKNIGHT = 11;
    private static final int BPAWN = 12;

    private static final int nPieceTypes = 13;

	public Piece () {
		this.EMPTY = EMPTY;
		this.WKING = WKING;
		this.WQUEEN = WQUEEN;
		this.WROOK = WROOK;
		this.WBISHOP = WBISHOP;
		this.WKNIGHT = WKNIGHT;
		this.WPAWN = WPAWN;
		this.BKING = BKING;
		this.BQUEEN = BQUEEN;
		this.BROOK = BROOK;
		this.BBISHOP = BBISHOP;
		this.BKNIGHT = BKNIGHT;
		this.BPAWN = BPAWN;
		this.nPieceTypes = nPieceTypes;
	}
}

public class WKING extends Piece {
	private static final int range;
	
	public WKING () {
		super ();
		this.range = range;
	}
	
	public void move () {
		move = range;
	}
}