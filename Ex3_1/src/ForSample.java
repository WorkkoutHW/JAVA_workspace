
public class ForSample {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<11; i++) {
			if (i != 10) {
				System.out.print(i);
				System.out.print("+");
			}
			else
			{	System.out.print(i);
				System.out.print("=");
			}
			sum += i;
		}
		System.out.print(sum);
	}
}
