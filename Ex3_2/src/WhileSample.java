import java.util.Scanner;
public class WhileSample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		
		System.out.print("정수릴 입력하고 마지막에 -1을 입력하세요");
		int num = scanner.nextInt();
		
		while(num != -1) {
			sum += num;
			count ++;
			num = scanner.nextInt();
		}
		
		if(count == 0) {
			System.out.print("아무것도 입력되지 않았습니다.");
		}
		else {
			System.out.printf("정수의 개수는 %d개이며 평균은 %f입니다.", count, (double)sum/count);
//			System.out.print("정수의 개수는" + count + "개이며 평균은" + (double)sum/count + "입니다.");
		}
		
		scanner.close();
	}
}