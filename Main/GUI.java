package Main;

import java.awt.*;
import javax.swing.*;

class GUI extends JFrame {
	private int wZaslon;
	private int hZaslon;
	
	public GUI () {
		
	}
	
	public void components () {
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension d=tk.getScreenSize();
		wZaslon=d.width;
		hZaslon=d.height;
	}
}