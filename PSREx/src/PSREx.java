import java.util.Scanner;

public class PSREx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int data, com;
		String prs[] = {"Dummy", "����", "����", "��"};
		
		while(true) {
			System.out.print("ö��[����(1), ����(2), ��(3), ������(4)]>>");
			data = scan.nextInt();
			if(data == 4) break;
			com = (int)(Math.random()*3+1);
			System.out.printf("ö��(%s) : ��ǻ��(%s)\n", prs[data], prs[com]);
		
			int result = data - com;
		
			if(result == 1 || result == -2)
				System.out.println("ö���� �̰���ϴ�.");
			else if(result == -1 || result == 2)
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			else
				System.out.println("�����ϴ�.");
		}
		
		scan.close();
		
	}
}
