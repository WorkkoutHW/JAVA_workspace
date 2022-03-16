import java.util.Scanner;

public class PSREx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int data, com;
		String prs[] = {"Dummy", "가위", "바위", "보"};
		
		while(true) {
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			data = scan.nextInt();
			if(data == 4) break;
			com = (int)(Math.random()*3+1);
			System.out.printf("철수(%s) : 컴퓨터(%s)\n", prs[data], prs[com]);
		
			int result = data - com;
		
			if(result == 1 || result == -2)
				System.out.println("철수가 이겼습니다.");
			else if(result == -1 || result == 2)
				System.out.println("컴퓨터가 이겼습니다.");
			else
				System.out.println("비겼습니다.");
		}
		
		scan.close();
		
	}
}
