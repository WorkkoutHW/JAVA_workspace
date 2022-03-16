import java.util.Random;

public class rdten {
	public static void main(String[] args) {
		Random r = new Random();
		double sum = 0.0;
		
		int intList[] = new int[10];
		System.out.print(intList.length);
		
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for(int i=0; i<intList.length; i++) {
			intList[i] = r.nextInt(10);
			System.out.printf("%d ", intList[i]);
			sum += intList[i];
		}
		System.out.printf("\nÆò±ÕÀº %.1f", (sum / intList.length));
	}
}
