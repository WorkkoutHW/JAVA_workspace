
public class foreachEX {
	public static void main(String[] args) {
		int[] n = {1, 2, 3, 4, 5};
		String names[] = {"���", "��", "�ٳ���","ü��", "����", "����"};
		
		int sum = 0;
		for (int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.printf("���� %d\n", sum);
	
		for(String s : names)
			System.out.print(s + " ");
	}
	
}
