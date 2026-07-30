package frontend;
import java.awt.*;
import javax.swing.*;
public class Frame extends Panel{
	private JFrame MainFrame;
	private Panel colorPanel = new Panel();
	void makingframe() {
		this.MainFrame = new JFrame("Habits&Task Tracker");
		this.MainFrame.add(colorPanel.returnPanel(),BorderLayout.CENTER);
		this.MainFrame.setSize(500, 500);
		this.MainFrame.setLocationRelativeTo(null);
		this.MainFrame.setBackground(new Color(173,172,242));
		this.MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.MainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.MainFrame.setVisible(true);
	}
}
