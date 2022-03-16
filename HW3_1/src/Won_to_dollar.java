import java.util.Scanner;


public class Won_to_dollar {
	// Public class's name isn't dollar. It's dallor..
	public static void main(String[] args) {
		final int oneDallor = 1100;
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		Scanner scanner = new Scanner(System.in);
		
		int won = scanner.nextInt();
		
		double won_to_dallor = (double)won / (double)oneDallor;
		System.out.println(won + "원은 $" + won_to_dallor + "입니다.");
		
		scanner.close();
	}
}
