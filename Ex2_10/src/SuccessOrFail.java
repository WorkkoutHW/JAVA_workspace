import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int score1 = score.nextInt();
		if (score1 >= 80) {
			System.out.print("�����մϴ�! �հ��Դϴ�.");
		}
		
		score.close();
	}
}
