import java.util.Scanner;
public class Exchange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int exchange[] = new int[unit.length];

		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			int quotient = money/unit[i];
			exchange[i] = quotient;
			money -= (quotient * unit[i]);
		}
		
		for(int i=0; i<exchange.length; i++) {
			System.out.printf("%d원 짜리 : %d개\n", unit[i], exchange[i]);
		}
		
		
		scanner.close();
	}
}
