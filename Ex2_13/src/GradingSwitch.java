import java.util.Scanner;

public class GradingSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.print("������ �Է��ϼ���(0~100)");
		int score = scanner.nextInt();
		
		switch (score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		default:
			grade = 'F';
		}
		
		System.out.println("������" + grade + "�Դϴ�.");
		scanner.close();
	}
}
