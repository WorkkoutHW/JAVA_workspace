import java.util.Scanner;

public class Rock_Seasor_Paper {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int com_num;
		int three_state_com;
		String rsp_user = null, rsp_com = null;
	
		
		while(true) {
		
		System.out.print("ö��[����(1), ����(2), ��(3), ������(4)]>>");
		int user_num = scan.nextInt();
		
		// ������(4) �Է½� while�� Ż�� 
		if (user_num == 4)
			break;
			
		// ���������� ������ �ϴ� main code
		else {
			// computer�� ���ڸ� �޾ƿ�
			com_num = (int)(Math.random() * 100);
				
			if (com_num == 99) {
				com_num = 98;
				three_state_com = (com_num / 33) + 1;
			}
			else
				three_state_com = (com_num / 33) + 1;
			
			
			switch(user_num) {
			case 1:
				rsp_user = "����";
				break;
			case 2:
				rsp_user = "����";
				break;
			case 3:
				rsp_user = "��";
				break;
			}
			
			switch(three_state_com){
			case 1:
				rsp_com = "����";
				break;
			case 2:
				rsp_com = "����";
				break;
			case 3:
				rsp_com = "��";
				break;
			}
			
			System.out.printf("ö��(%s) : ��ǻ��(%s)\n", rsp_user, rsp_com);
			
			// ���������� ����
			if (rsp_user == "����") {
				switch(rsp_com) {
				case "����":
					System.out.print("ö���� �̰���ϴ�.");
					break;
				case "��":
					System.out.print("��ǻ�Ͱ� �̰���ϴ�.");
					break;
				default:
					System.out.print("�����ϴ�.");
					break;
				}
			}

			else if (rsp_user == "��") {
				switch(rsp_com) {
				case "����":
					System.out.print("��ǻ�Ͱ� �̰���ϴ�.");
					break;
				case "����":
					System.out.print("ö���� �̰���ϴ�.");
					break;
				default:
					System.out.print("�����ϴ�.");
					break;
				}
			}
			
			else
				switch(rsp_com) {
				case "����":
					System.out.print("��ǻ�Ͱ� �̰���ϴ�.");
					break;
				case "��":
					System.out.print("ö���� �̰���ϴ�.");
					break;
				default:
					System.out.print("�����ϴ�.");
					break;
				}
			
			System.out.printf("\n");
		}
		
		
		}
	}
}
