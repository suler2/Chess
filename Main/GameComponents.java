

import Pieces.*;
import Pieces.Wking;
import Pieces.Wqueen;
import Pieces.Wrook;
import Pieces.Wbishop;
import Pieces.Wknight;
import Pieces.Wpawn;
import Pieces.Bking;
import Pieces.Bqueen;
import Pieces.Brook;
import Pieces.Bbishop;
import Pieces.Bknight;
import Pieces.Bpawn;

class GameComponents {
	
	
	public GameComponents () {
		
	}
	
	public void start () {
		Wking w = new Wking ();
		if (w.isAlive() == true)
		w.move();
		System.out.println (w.value());
	}
}