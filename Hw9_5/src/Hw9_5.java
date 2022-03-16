interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}

class Circle implements Shape{
	private int line;
	public Circle(int line) {this.line = line;}
	public void draw() {
		System.out.printf(" �������� %d�� ���Դϴ�.\n", line);
	}
	public double getArea() {
		return line * line * PI ;
	}
}

public class Hw9_5 {
	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("������ " + donut.getArea());
	}
}
