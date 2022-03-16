import java.util.Calendar;

public class CalendarEx {
	
	public static void printCalendar(String msg, Calendar cal) {
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		
		System.out.printf("%s %d시 %d분입니다\n", msg, hour, minute);
		switch(hour) {
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
			System.out.print("Good Morning");
			break;
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			System.out.print("Good Afternoon");
			break;
		case 18:
		case 19:
		case 20:
		case 21:
			System.out.print("Good Evening");
			break;
		default:
			System.out.print("Good night");
			break;
		}
	}
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("현재 시간은", now);
	}
}
