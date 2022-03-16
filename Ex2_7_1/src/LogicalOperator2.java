
public class LogicalOperator2 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = -200;
		
		boolean a = (num1 != 0);
		boolean b = (num2 != 0);
		
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(!a);
	}
}
