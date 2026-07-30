package frontend;
import javax.swing.*;
import java.awt.*;
public class Buttons {
	private JPanel panel = new JPanel();
	private JButton newButton = new JButton("New");
	Buttons(){
		panel.setLayout(new GridLayout(0,1));
		newButton.setBackground(new Color(103, 147, 227));
		this.newButton.setSize(new Dimension(200,200));
		panel.add(newButton);
	}
	JPanel returnButtonPanel() {
		return this.panel;
	}
}
