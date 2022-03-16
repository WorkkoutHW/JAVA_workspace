import java.util.Scanner;

public class Nestedlf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학년을 입력하세요: ");
		int year = scanner.nextInt();
		
		System.out.print("점수를 입력하세욜: ");
		int score = scanner.nextInt();
		
		if (year == 4)
		{
			if (score >= 70) {
				System.out.print("합격!");
			}
			else {
				System.out.print("불합격!");
			}
		}
		else {
			if (score >= 60) {
				System.out.print("합격!");
			}
			else {
				System.out.print("불합격!");
			}
		}
		
		scanner.close();
	}
}
