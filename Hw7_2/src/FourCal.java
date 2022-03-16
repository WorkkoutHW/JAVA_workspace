import java.util.Scanner;

class Add{
	int a;
	int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculat() {
		return a + b;
	}
}

class Sub{
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculat() {
		return a - b;
	}
}

class Mul{
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculat() {
		return a * b;
	}
}

class Div{
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void calculat() {
		if (b == 0) 
			System.out.print("�и𿡴� 0�� �� �� �����ϴ�.");
		else
			System.out.printf("%d", (int)(a/b));
		}
}

public class FourCal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		String oper = scanner.next();
		
//		System.out.printf("%d %d %s", num1, num2, oper);
// Each class's creator be made by default.
		
		if (oper.equals("+")) {
			Add ad = new Add();
			ad.setValue(num1, num2);
			System.out.print(ad.calculat());
		}
		
		else if (oper.equals("-")) {
			Sub sb = new Sub();
			sb.setValue(num1, num2);
			System.out.print(sb.calculat());
		}

		else if (oper.equals("*")) {
			Mul ml = new Mul();
			ml.setValue(num1, num2);
			System.out.print(ml.calculat());
		}
		
		else if (oper.equals("/")) {
			Div dv = new Div();
			dv.setValue(num1, num2);
			dv.calculat();
		}
		
		else
			System.out.print("��Ģ���길 �����մϴ�. �˸��� �����ڸ� �����ּ���.");
	}
}
