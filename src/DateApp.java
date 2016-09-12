
public class DateApp 
{
	public static void main(String[] args) 
	{
		Calendar c = new Calendar();
		System.out.println(c.displayCalendar(10,2016));
		System.out.println(c.isLeapYear(2000));
		System.out.println(c.getLastDayOfMonth(10,2016));
		System.out.println(c.toString(10,28, 2016,"/"));
		
	}
	
	
}
