package Pieces;

public class Wking extends Piece {
	public static final int maxRange = 1;
	
	public Wking () {
		super ();
	}
	
	public boolean isAlive () {
		boolean alive = true;
		System.out.println (alive);
		return alive;
	}
	
	public void move () {
		int move = maxRange;
		System.out.println (move);
	}
	
	public int[] position () {
		int[] pos = new int[2];
		pos[0] = 0;
		pos[1] = 0;
		return pos;
	}
	
	public int value () {
		return 1;
	}
}