import java.util.Scanner;
public class Grading {
	public static void main(String[] args) {
		char giveGrade;
		Scanner mgrade = new Scanner(System.in);
		
		
		System.out.print("������ �Է��ϼ���(0~100): ");
		int score = mgrade.nextInt();
		
		if ((score >= 0) && (score <= 100)) {
			if(score >= 90)
				{giveGrade = 'A';
				System.out.print("������" + giveGrade);
				}
			else
				giveGrade = 'F';
		}
		else {
			System.out.print("���� ���� ������ �ƴմϴ�.");
		}
		
		
		mgrade.close();
	}
}
