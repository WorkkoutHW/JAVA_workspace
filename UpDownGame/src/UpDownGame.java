import java.util.Scanner;
import java.util.Random;
import java.util.Random;

public class UpDownGame {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		String text;
		
		do {
			int high = 99;
			int low = 0;
			int answer = r.nextInt(100);
			int count = 0;
			System.out.println("���� �����Ͽ����ϴ�. ���纸����.");
			
			while(true) {
				System.out.printf("%d-%d\n", low, high);
				System.out.printf("%d>>", count);
				int guess = s.nextInt();
				
				if (guess == answer)
					break;
				else if (guess > answer) {
					System.out.println("�� ����");
					high = guess;}
				else {
					System.out.println("�� ����");
					low = guess;}
					
				count++;
				}
			
			System.out.print("�¾ҽ��ϴ�.");
			System.out.print("�ٽ��ϰڽ��ϱ�(y/n)>>");
			
			text = s.next();
			
			}while(text.equals("y"));
			s.close();
		}
}
