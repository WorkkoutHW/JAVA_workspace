import java.util.Scanner;
public class WhileSample3 {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		int n = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		while(true) {
			n = scanner.nextInt();
			if (n == -1) {
				break;
			}
			else {
				sum += n;
				count ++;
			}
		}
		
		if(count == 0) System.out.println("�Էµ� ���� �����ϴ�.");
		else {
			System.out.print("������ ������ " + count + "���̸�");
			System.out.println("����� " + (double)sum/count + "�Դϴ�.");
		}
		scanner.close();
	}
}
