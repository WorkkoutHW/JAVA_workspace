import java.util.Scanner;
public class numToseason {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(����:1~12)>> ");
		int getNum = scanner.nextInt();
		
			switch(getNum) {
			case 12:
			case 1:
			case 2:
				System.out.print("�ܿ�");
				break;
			case 3:
			case 4:
			case 5:
				System.out.print("��");
				break;
			case 6:
			case 7:
			case 8:
				System.out.print("����");
				break;
			case 9:
			case 10:
			case 11:
				System.out.print("����");
				break;
				
			default:
				System.out.print("�߸��Է�");
			}
		
		scanner.close();
	}
}