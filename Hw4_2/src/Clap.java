import java.util.Scanner;
public class Clap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int getNum = 0;
		int fir_num = 0;
		int sec_num = 0;
		
		
		do {System.out.print("1~99 ������ ������ �Է��Ͻÿ�. �ٸ� ���� �Է��ϱ⸸��!!>>");
			
			getNum = scanner.nextInt();
			fir_num = getNum / 10;
			sec_num = getNum % 10;
			
			if ((getNum >= 1) && (getNum <= 99)){
			
				if (fir_num % 3 == 0) {
					if (sec_num % 3 == 0) {
						System.out.print("�ڼ�¦¦");
						break;
					}
					else {
						System.out.print("�ڼ�¦");
						break;}
				}
				else
				{
					if (sec_num % 3 == 0) {
						System.out.print("�ڼ�¦");
						break;
					}
					else {
						System.out.print("�ڼ����� ��ģ��!");
						break;
					}
				}
			}
			else
				System.out.println("1~99������ �Է��϶�� ����! �ٽ� �Է��Ϸ�");
		} while(true);

		scanner.close();
	}
}
