
import java.awt.*;
import javax.swing.*;
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
import java.lang.Math;

public class MainPanel extends JPanel {
	private int wZaslon;
	private int hZaslon;
//	private Container c;
	private Graphics2D g;
	private int sizeOfSquare;
	private int[][] boardArray;

	public MainPanel (int wZaslon, int hZaslon, int[][] boardArray) {
		this.wZaslon = wZaslon;
		this.hZaslon = hZaslon;
		this.boardArray = boardArray;
		setPreferredSize(new Dimension (Math.min(wZaslon, hZaslon) - 200, Math.min(wZaslon, hZaslon) - 200));
		System.out.println ("Size: " + (Math.min(wZaslon, hZaslon) - 200));
		sizeOfSquare = (int) getPreferredSize().getWidth() / 8;
		setVisible (true);
	}
	
	public int sizeOfSquare() {
		return sizeOfSquare;
	}
	
	//@Override
	public void paintComponent(Graphics g0) {
		g = (Graphics2D) g0;
		System.out.println ("SizeOfSquare: " + sizeOfSquare());
		System.out.println ("PanelWidth: " + getSize().getWidth());
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
		//		System.out.print (boardArray[i][j]);
				if (boardArray[i][j] == 1) {
					g.setColor(Color.WHITE);
					g.fillRect(i * sizeOfSquare(), j * sizeOfSquare(), (i + 1) * sizeOfSquare(), (j + 1) * sizeOfSquare());
				}
				else if (boardArray[i][j] == 0) {
					g.setColor(Color.BLACK);
					g.fillRect(i * sizeOfSquare(), j * sizeOfSquare(), (i + 1) * sizeOfSquare(), (j + 1) * sizeOfSquare());
				}
			}
		//	System.out.println ();
		}
	}
}