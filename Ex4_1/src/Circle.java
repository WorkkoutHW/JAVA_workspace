
public class Circle {
	int radius;
	String name;
	
	public Circle() {}
	
	public double getArea() {
		return radius * radius * 3.14;
	}
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "��������";
		double area = pizza.getArea();
		System.out.printf("%s�� ������ %.1f\n", pizza.name, area);
		
		Circle dount = new Circle();
		dount.name = "ũ������";
		dount.radius = 2;
		area = dount.getArea();
		System.out.printf("%s�� ������ %.1f", dount.name, area);
	}
}
