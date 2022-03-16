import java.util.Scanner;
public class WhileSample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		int num = 0;
		
		System.out.print("정수를 입력하시고 마지막에 -1입력하세요.");
		
		do {
			num = scanner.nextInt();
			sum += num;
			count ++;
		} while(num != -1);
		
		sum -= num;
		count --;
		
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
