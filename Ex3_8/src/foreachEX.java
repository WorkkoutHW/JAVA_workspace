
public class foreachEX {
	public static void main(String[] args) {
		int[] n = {1, 2, 3, 4, 5};
		String names[] = {"사과", "배", "바나나","체리", "딸기", "포도"};
		
		int sum = 0;
		for (int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.printf("합은 %d\n", sum);
	
		for(String s : names)
			System.out.print(s + " ");
	}
	
}
