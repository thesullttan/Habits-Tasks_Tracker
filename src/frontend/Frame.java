package frontend;
import javax.swing.*;
public class Frame {
	private JFrame MainFrame;
	void makingframe() {
		MainFrame = new JFrame("Habits&Task Tracker");
		this.MainFrame.setSize(500, 500);
		this.MainFrame.setLocationRelativeTo(null);
		this.MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.MainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.MainFrame.setVisible(true);
	}
}
