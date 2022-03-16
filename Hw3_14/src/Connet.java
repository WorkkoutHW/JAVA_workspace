import java.util.Scanner;

public class Connet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		int count = 0;
		
		String subject;
		
		while(true) {
			System.out.print("과목 이름>>");
			subject = scanner.next();
			count = 0;
			
			if (subject.equals("그만"))
				break;
			
			for (int i=0; i<course.length; i++) {
				if (subject.equals(course[i]))
					System.out.printf("%s의 점수는 %d \n", course[i], score[i]);
				else
					count ++;
				}
				
			if (count == course.length)
				System.out.println("없는 과목입니다.");
			
			}
		
		scanner.close();
	}
		
}

