import java.util.Scanner;

class Dictionary{
	private static String kor[] = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String eng[] = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {

		int right_count = 0;
		int desc_num = 0;
		
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				right_count = -1;
				desc_num = i;
				break;
			}
			else right_count += 1;
		}
		
		switch(right_count) {
		case -1:
			return eng[desc_num];
		default:
			return "no";
		}
			
		
		
		
		
		/* class�� return ���� void�� ������ָ� ��밡��
		 * for(int i=0; i<kor.length; i++) {
			if(kor[i] == word) -> python ǥ���� �ȵ�!!!! eqauls method �̿��ؾ��� �ФФФ�
			{ 
				System.out.printf("%s�� %s", kor[i], eng[i]);
			}
			else {
				System.out.printf("%s�� ���� ������ �����ϴ�.", word);
			}
		} */
		
	}
}
public class SearchPrograme {
	// �������� ���� DicApp class�� �ش� class�� �̸����� ��ü�Ǿ� �ϴ°�? 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.\n");
		while(true)
		{
			System.out.print("�ѱ� �ܾ�?");
			String word = scanner.next();
			if (word.equals("�׸�")) {
				break;
			}
			else {
				String eng_name = Dictionary.kor2Eng(word);
				if (eng_name.equals("no")) {
					System.out.printf("%s�� ���� ������ �����ϴ�.\n", word);
				}
				else {
					System.out.printf("%s��(��) %s\n", word, eng_name);
				}
				
		}
	}
}
}