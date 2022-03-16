import java.util.Scanner;

class Circle{
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.printf("(%.1f,%.1f)%d\n", x, y, radius);
	}
}

public class CircleManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];
		
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x_value = scanner.nextDouble();
			double y_value = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x_value, y_value, radius);
		}
		
		for(int i=0; i<c.length; i++) c[i].show();
		scanner.close();
		
	}
}
