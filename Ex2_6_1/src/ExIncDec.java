
public class ExIncDec {
	public static void main(String[] args) {
		int x = 1;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		
		int a = 1, b = 1;
		int result = -++a + b--;
		System.out.println("result=" + result + ", a=" + a + ", b=" + b);
	}
}
