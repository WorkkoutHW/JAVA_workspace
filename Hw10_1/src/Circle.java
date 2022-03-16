
public class Circle {
	private int x, y, r;
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public boolean eqauls(Circle cir) {
		if((cir.x == x) && (cir.y == y)) return true;
		else return false;
	}
	public String toString() {
		return "Circle(" + x + "," + y + ")반지름" + r;
	}
	
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.eqauls(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}
}
