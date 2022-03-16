import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int day_of_week = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("%d년 %d월 %d일 %d시", year, month, day, hour);
		System.out.print(day_of_week);
	}
	
}
