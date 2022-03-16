import java.util.Scanner;
class CurrencyConverter{
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	
	public static double toKWR(double dollar) {
		return dollar * rate;
	}
	
	public static void setRate(double r) {
		rate = r;
	}
}


public class StaticMember {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("환율(1달러)>> ");
		double rate = scan.nextDouble();
		
		CurrencyConverter.setRate(1121);
		System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다. ");
		System.out.println("$100는" + CurrencyConverter.toKWR(100) + "원 입니다." );
		scan.close();
		}
}
