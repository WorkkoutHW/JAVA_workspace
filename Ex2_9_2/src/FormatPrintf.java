
public class FormatPrintf {
	public static void main(String[] args) {
		System.out.printf("100+200\n");
		System.out.printf("%d\n", 100+200);
		System.out.printf("두 수의 합 %d + %f = %f\n", 10, 12.3, 10+12.3);
		System.out.printf("%c, %s\n", 'a', "안녕하세요");
		System.out.printf("%10d\n", 100);
		System.out.printf("%010d\n", 100);
		System.out.printf("%10f\n", 12.3);
		System.out.printf("%10s\n", "java");
	}
}
