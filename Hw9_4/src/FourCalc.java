import java.util.Scanner;

abstract class Calc{
	public abstract void setValue(int a, int b);
	public abstract int calculate();
}

class Add extends Calc{
	private int a, b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a + b;
	}
}

class Sub extends Calc{
	private int a, b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a - b;
	}
}

class Mul extends Calc{
	private int a, b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a * b;
	}
}

class Div extends Calc{
	private int a, b;
	private int result;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		
		if (b == 0)
			result = -1;
		else
			result = a / b;
			return result;
	}
	
}

public class FourCalc {
	public static void main(String[] args) {
		int a, b;
		String c;
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.next();
		
		if (c.equals("+")) {
			Add add = new Add();
			add.setValue(a, b);
			System.out.printf("%d", add.calculate());
		}
		
		else if (c.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.printf("%d", sub.calculate());
		}
		
		else if (c.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.printf("%d", mul.calculate());
		}
		
		else if(c.equals("/")) {
			Div div = new Div();
			div.setValue(a, b);
			if (div.calculate() == -1) {
				System.out.print("�и𿡴� 0�� �� �� �����ϴ�.");
			}
			else {
				System.out.printf("%d", div.calculate());
			}
		}
		
		else
			System.out.print("��Ģ���길 ���� �����մϴ�.");
		
		scan.close();
	}
}
