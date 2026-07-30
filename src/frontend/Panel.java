package frontend;
import javax.swing.*;
import java.awt.*;
public class Panel extends Buttons{
	private JPanel fullscreenpanel;
	Panel() {
		this.fullscreenpanel = new JPanel();
		this.fullscreenpanel.add(returnButtonPanel());
		this.fullscreenpanel.setBackground(new Color(173, 172, 242));
	}
	JPanel returnPanel() {
		return this.fullscreenpanel;
	}
}
