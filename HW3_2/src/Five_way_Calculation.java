import java.util.Scanner;

public class Five_way_Calculation {
	public static void main(String[] args) {
		System.out.print("두 정수를 입력하시오: ");
		Scanner two_number = new Scanner(System.in);
		
		int first_number = two_number.nextInt();
		int second_number = two_number.nextInt();
		
		System.out.println(first_number + "+" + second_number + "=" + (first_number + second_number));
		System.out.println(first_number + "-" + second_number + "=" + (first_number - second_number));
		System.out.println(first_number + "*" + second_number + "=" + (first_number * second_number));
		System.out.println(first_number + "/" + second_number + "=" + (first_number / second_number));
		System.out.println(first_number + "%" + second_number + "=" + (first_number % second_number));

		two_number.close();
	}
}
