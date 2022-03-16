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
			System.out.println("수를 결정하였습니다. 맞춰보세요.");
			
			while(true) {
				System.out.printf("%d-%d\n", low, high);
				System.out.printf("%d>>", count);
				int guess = s.nextInt();
				
				if (guess == answer)
					break;
				else if (guess > answer) {
					System.out.println("더 낮게");
					high = guess;}
				else {
					System.out.println("더 높게");
					low = guess;}
					
				count++;
				}
			
			System.out.print("맞았습니다.");
			System.out.print("다시하겠습니까(y/n)>>");
			
			text = s.next();
			
			}while(text.equals("y"));
			s.close();
		}
}
