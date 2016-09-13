
public class DateApp 
{
	public static void main(String[] args) 
	{
		DateUtil c = new DateUtil();
		System.out.println(c.displayCalendar(10,2016));
		System.out.println(c.isLeapYear(2000));
		System.out.println(c.getLastDayOfMonth(10,2016));
		System.out.println(c.toString(10,28, 2016,"/"));
		System.out.println(c.daysbw(4,3,2016,4,4,2016));
		System.out.println(c.daysbw("4/1/2016","4/4/2016"));
		System.out.println(c.DayOfWeek(9,12,2016));
		System.out.println(c.daysAgo(9,10,2016));
		System.out.println(c.now());
		System.out.println(c.now("dd-MM-yyyy"));
		
	}
	
	
}
