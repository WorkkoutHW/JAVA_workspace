import java.util.Scanner;

class Dictionary{
	private static String kor[] = {"사랑", "아기", "돈", "미래", "희망"};
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
			
		
		
		
		
		/* class의 return 형을 void로 만들어주면 사용가능
		 * for(int i=0; i<kor.length; i++) {
			if(kor[i] == word) -> python 표현법 안됨!!!! eqauls method 이용해야함 ㅠㅠㅠㅠ
			{ 
				System.out.printf("%s은 %s", kor[i], eng[i]);
			}
			else {
				System.out.printf("%s는 저의 사전에 없습니다.", word);
			}
		} */
		
	}
}
public class SearchPrograme {
	// 문제에서 나온 DicApp class가 해당 class의 이름으로 교체되야 하는가? 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("한영 단어 검색 프로그램입니다.\n");
		while(true)
		{
			System.out.print("한글 단어?");
			String word = scanner.next();
			if (word.equals("그만")) {
				break;
			}
			else {
				String eng_name = Dictionary.kor2Eng(word);
				if (eng_name.equals("no")) {
					System.out.printf("%s는 저의 사전에 없습니다.\n", word);
				}
				else {
					System.out.printf("%s은(는) %s\n", word, eng_name);
				}
				
		}
	}
}
}