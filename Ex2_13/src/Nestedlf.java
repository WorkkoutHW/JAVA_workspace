import java.util.Scanner;

public class Nestedlf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�г��� �Է��ϼ���: ");
		int year = scanner.nextInt();
		
		System.out.print("������ �Է��ϼ���: ");
		int score = scanner.nextInt();
		
		if (year == 4)
		{
			if (score >= 70) {
				System.out.print("�հ�!");
			}
			else {
				System.out.print("���հ�!");
			}
		}
		else {
			if (score >= 60) {
				System.out.print("�հ�!");
			}
			else {
				System.out.print("���հ�!");
			}
		}
		
		scanner.close();
	}
}
