

import Pieces.*;

public class Chess {
	public static void main (String[] args) {
	//	GUI gui = new GUI();
	//	gui.components();
		GameComponents gc = new GameComponents ();
		gc.start();
		Board b = new Board ();
		b.GUIcomponents();
	}
}