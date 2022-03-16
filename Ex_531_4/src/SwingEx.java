import javax.swing.*;
import java.awt.*;

public class SwingEx extends JFrame{
	public SwingEx() {
		super("Five Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,5));
		
		JButton button[] = new JButton[5];
		Color clr[] = {Color.RED, Color.ORANGE, Color.YELLOW ,Color.GREEN, Color.BLUE};
		
		for (int i=0; i<button.length; i++) {
			button[i] = new JButton(Integer.toString(i));
			button[i].setBackground(clr[i]);
			c.add(button[i]);}
		
		setSize(500, 300);
		setVisible(true);
		}
	public static void main(String[] args) {
		new SwingEx();
	}
}
