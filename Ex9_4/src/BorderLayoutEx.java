import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	BorderLayoutEx(){
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(30, 20));
		c.setBackground(Color.BLACK);
		
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("div"), BorderLayout.WEST);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("calculate"), BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
