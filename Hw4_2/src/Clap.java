import java.util.Scanner;
public class Clap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int getNum = 0;
		int fir_num = 0;
		int sec_num = 0;
		
		
		do {System.out.print("1~99 사이의 정수를 입력하시오. 다른 숫자 입력하기만해!!>>");
			
			getNum = scanner.nextInt();
			fir_num = getNum / 10;
			sec_num = getNum % 10;
			
			if ((getNum >= 1) && (getNum <= 99)){
			
				if (fir_num % 3 == 0) {
					if (sec_num % 3 == 0) {
						System.out.print("박수짝짝");
						break;
					}
					else {
						System.out.print("박수짝");
						break;}
				}
				else
				{
					if (sec_num % 3 == 0) {
						System.out.print("박수짝");
						break;
					}
					else {
						System.out.print("박수따윈 안친다!");
						break;
					}
				}
			}
			else
				System.out.println("1~99까지만 입력하라고 했지! 다시 입력하렴");
		} while(true);

		scanner.close();
	}
}
