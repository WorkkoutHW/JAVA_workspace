import java.util.Scanner;
public class WhileSample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		
		System.out.print("������ �Է��ϰ� �������� -1�� �Է��ϼ���");
		int num = scanner.nextInt();
		
		while(num != -1) {
			sum += num;
			count ++;
			num = scanner.nextInt();
		}
		
		if(count == 0) {
			System.out.print("�ƹ��͵� �Էµ��� �ʾҽ��ϴ�.");
		}
		else {
			System.out.printf("������ ������ %d���̸� ����� %f�Դϴ�.", count, (double)sum/count);
//			System.out.print("������ ������" + count + "���̸� �����" + (double)sum/count + "�Դϴ�.");
		}
		
		scanner.close();
	}
}