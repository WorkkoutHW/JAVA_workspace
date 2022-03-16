import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel{
	NorthPanel(){
		setBackground(Color.GRAY);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		add(new JLabel("수식입력"));
		add(new JTextField(20));
	}
}

class CenterPanel extends JPanel{
	CenterPanel(){
		setLayout(new GridLayout(4, 4, 2, 2));
		
		for(int i=0; i<10; i++) {
			JButton b = new JButton(Integer.toString(i));
			add(b);}
		
		JButton two[] = new JButton[2];
		two[0] = new JButton("CE");
		two[1] = new JButton("계산");
		
		add(two[0]);
		add(two[1]);
		
		JButton four[] = new JButton[4];
		four[0] = new JButton("+");
		four[1] = new JButton("-");
		four[2] = new JButton("x");
		four[3] = new JButton("/");
		
		for(int j=0; j<four.length ; j++) {
			four[j].setBackground(Color.CYAN);
			add(four[j]);
		}
		
		}
	}

class SouthPanel extends JPanel{
	
	SouthPanel(){
		setBackground(Color.YELLOW);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		add(new JLabel("계산결과"));
		add(new JTextField(20));
	}
}

public class Interal extends JFrame{
	Interal(){
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		Container c = getContentPane();
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);

		setSize(400, 400);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Interal();
	}
}
