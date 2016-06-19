
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
	public static final int[][] boardArray = new int[size][size];
	private int sizeOfSquare;
	
	public Board () {
		
	}
	
	public void GUIcomponents () {
		createFrame();
		createPanel();
		add(MainPanel, BorderLayout.CENTER);
	//	System.out.println(panelHeight());
	}
	
	public void createFrame () {
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension d=tk.getScreenSize();
		wZaslon=d.width;
		hZaslon=d.height;
		setSize(wZaslon, hZaslon);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(new BorderLayout());
	}
	
	public void createPanel () {
		MainPanel = new JPanel();
		GroupLayout MainPanelLayout = new GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
		MainPanel.setSize(Math.min(wZaslon, hZaslon) - 200, Math.min(wZaslon, hZaslon) - 200);
		MainPanel.setVisible (true);
		sizeOfSquare = (int) MainPanel.getSize().getWidth();
	}
	
	// 1 bela, 0 crna
	public static int[][] boardArray () {
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