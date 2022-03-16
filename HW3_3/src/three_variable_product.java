import java.util.Scanner;


public class three_variable_product {
	public static double three_product(double a, double b, double c){
		return a * b * c;
	}
	
	public static void main(String[] args) {
		System.out.print("세 개의 실수를 입력하세요(띄어쓰기로 구분):");
		Scanner all_number = new Scanner(System.in);
		
		double first_num = all_number.nextDouble();
		double second_num = all_number.nextDouble();
		double third_num = all_number.nextDouble();
		
		double result_of_method = three_product(first_num, second_num, third_num);
		
		System.out.print(first_num + "*" + second_num + "*" + third_num + "의 결과 = " + result_of_method);
		
		all_number.close();
	}
}
