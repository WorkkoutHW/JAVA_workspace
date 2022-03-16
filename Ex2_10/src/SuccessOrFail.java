import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score1 = score.nextInt();
		if (score1 >= 80) {
			System.out.print("축하합니다! 합격입니다.");
		}
		
		score.close();
	}
}
