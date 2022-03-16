interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}

class Circle implements Shape{
	private int line;
	public Circle(int line) {this.line = line;}
	public void draw() {
		System.out.printf(" 반지름이 %d인 원입니다.\n", line);
	}
	public double getArea() {
		return line * line * PI ;
	}
}

public class Hw9_5 {
	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}
