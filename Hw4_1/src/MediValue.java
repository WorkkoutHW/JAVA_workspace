import java.util.Scanner;
public class MediValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("주의! 같은 정수를 입력하지 마시오!");
		System.out.print("정수 3개 입력>>");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int medValue = 0;
		
		if (((num1 < num2) && (num2 < num3)) | ((num1 > num2) && (num2 > num3)))
			medValue = num2;
		else if ((num1 < num2) && (num3 < num2))
			medValue = (num1 < num3) ? num3 : num1;
		else
			medValue = (num1 < num3) ? num1 : num3;
		
		System.out.printf("중간 값은 %d", medValue);
		
		scanner.close();
		
	}
}
