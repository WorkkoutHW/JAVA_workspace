import java.util.Scanner;

public class Connet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		int count = 0;
		
		String subject;
		
		while(true) {
			System.out.print("���� �̸�>>");
			subject = scanner.next();
			count = 0;
			
			if (subject.equals("�׸�"))
				break;
			
			for (int i=0; i<course.length; i++) {
				if (subject.equals(course[i]))
					System.out.printf("%s�� ������ %d \n", course[i], score[i]);
				else
					count ++;
				}
				
			if (count == course.length)
				System.out.println("���� �����Դϴ�.");
			
			}
		
		scanner.close();
	}
		
}

