import java.util.Scanner;
public class Grading {
	public static void main(String[] args) {
		char giveGrade;
		Scanner mgrade = new Scanner(System.in);
		
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = mgrade.nextInt();
		
		if ((score >= 0) && (score <= 100)) {
			if(score >= 90)
				{giveGrade = 'A';
				System.out.print("학점은" + giveGrade);
				}
			else
				giveGrade = 'F';
		}
		else {
			System.out.print("범위 내의 점수가 아닙니다.");
		}
		
		
		mgrade.close();
	}
}
