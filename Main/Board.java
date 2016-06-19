
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

public class Board extends JFrame {
	private int wZaslon;
	private int hZaslon;
	private JPanel MainPanel;
	public static final int size = 8;
	private int[][] boardArray = new int[size][size];
	private int sizeOfSquare;
	private MainPanel mainPanel;
	
	public Board () {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		wZaslon = d.width;
		hZaslon = d.height;
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(wZaslon, hZaslon);
	//	setExtendedState(JFrame.MAXIMIZED_BOTH);
	//	setLayout(new BorderLayout());
		boardArray = boardArray();
		mainPanel = new MainPanel(wZaslon, hZaslon, boardArray);
//		add(mainPanel, BorderLayout.CENTER);
		add(mainPanel);
		pack();
	}
	
	// 1 bela, 0 crna
	public int[][] boardArray () {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				boardArray[i * 2][j * 2] = 1;
				boardArray[i * 2][j * 2 + 1] = 0;
				boardArray[i * 2 + 1][j * 2 + 1] = 1;
				boardArray[i * 2 + 1][j * 2] = 0;
			}
		}
		return boardArray;
	}
}