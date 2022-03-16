package derived;
import base.Point;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y); // Point의 생성자 Point(x, y) 호출
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
