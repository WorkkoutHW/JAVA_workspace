import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("contentPane°ú JFrame");
		setSize(300, 150);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.ORANGE);
		
		c.setLayout(new FlowLayout());
		c.add(new JButton("ok"));
		c.add(new JButton("cancel"));
		c.add(new JButton("ignore"));
	
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
