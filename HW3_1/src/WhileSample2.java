import java.util.Scanner;
public class WhileSample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		int num = 0;
		
		System.out.print("������ �Է��Ͻð� �������� -1�Է��ϼ���.");
		
		do {
			num = scanner.nextInt();
			sum += num;
			count ++;
		} while(num != -1);
		
		sum -= num;
		count --;
		
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
