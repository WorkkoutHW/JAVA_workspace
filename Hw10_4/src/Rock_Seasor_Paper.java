import java.util.Scanner;

public class Rock_Seasor_Paper {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int com_num;
		int three_state_com;
		String rsp_user = null, rsp_com = null;
	
		
		while(true) {
		
		System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
		int user_num = scan.nextInt();
		
		// 끝내기(4) 입력시 while문 탈출 
		if (user_num == 4)
			break;
			
		// 가위바위보 연산을 하는 main code
		else {
			// computer의 숫자를 받아옴
			com_num = (int)(Math.random() * 100);
				
			if (com_num == 99) {
				com_num = 98;
				three_state_com = (com_num / 33) + 1;
			}
			else
				three_state_com = (com_num / 33) + 1;
			
			
			switch(user_num) {
			case 1:
				rsp_user = "가위";
				break;
			case 2:
				rsp_user = "바위";
				break;
			case 3:
				rsp_user = "보";
				break;
			}
			
			switch(three_state_com){
			case 1:
				rsp_com = "가위";
				break;
			case 2:
				rsp_com = "바위";
				break;
			case 3:
				rsp_com = "보";
				break;
			}
			
			System.out.printf("철수(%s) : 컴퓨터(%s)\n", rsp_user, rsp_com);
			
			// 가위바위보 연산
			if (rsp_user == "바위") {
				switch(rsp_com) {
				case "가위":
					System.out.print("철수가 이겼습니다.");
					break;
				case "보":
					System.out.print("컴퓨터가 이겼습니다.");
					break;
				default:
					System.out.print("비겼습니다.");
					break;
				}
			}

			else if (rsp_user == "보") {
				switch(rsp_com) {
				case "가위":
					System.out.print("컴퓨터가 이겼습니다.");
					break;
				case "바위":
					System.out.print("철수가 이겼습니다.");
					break;
				default:
					System.out.print("비겼습니다.");
					break;
				}
			}
			
			else
				switch(rsp_com) {
				case "바위":
					System.out.print("컴퓨터가 이겼습니다.");
					break;
				case "보":
					System.out.print("철수가 이겼습니다.");
					break;
				default:
					System.out.print("비겼습니다.");
					break;
				}
			
			System.out.printf("\n");
		}
		
		
		}
	}
}
