import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateUtil 
{
	public String displayCalendar(int month, int year)
	{
		
		String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Dec"};
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean bLeapYear = false;
		bLeapYear = (year % 4 == 0);
		bLeapYear = bLeapYear && (year % 100 != 0);
		bLeapYear = bLeapYear || (year % 400 == 0);
		month = month -1;
		if (bLeapYear && month ==1)
			days[month] = 29;
		GregorianCalendar gc = new GregorianCalendar(year,month,1);
		//String m = months[gc.get(Calendar.month)];
		String dayf = String.format("%s %s %s %s %s %s %s\n","Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		
		int d = gc.get(gc.DAY_OF_WEEK);
		d = d-1;
		String b = "";
		String c = "";
		for (int i = 0; i < d; i++)
            b = String.format("%s    ",b);
        for (int i = 1; i <= days[month]; i++) 
        {
            c = String.format("%s %2d ",c,i);
            if (((i + d) % 7 == 0) || (i == days[month])) c =String.format("%s\n",c);
        }
        return String.format( "\n         "+ months[month] + " " + year +
				"\n---------------------------\n" + dayf + b + c);
		
	}
	
	public boolean isLeapYear(int year)
	{
		//returns t/f if the year is a leap year
		// leap years are all years divisible by 4 but not 100
		// years that are divisible by 400 are leap years, too
		// is it divisible by 4?
		// Note that the year is not passed as an argument. It could be but 
		// I choose to use the class level private variable for my method.
		boolean bLeapYear = false;
		bLeapYear = (year % 4 == 0);
		// is it divisible by 4 and not 100
		bLeapYear = bLeapYear && (year % 100 != 0);
		// is it divisible by 4 and not 100 unless it's divisible by 400
		bLeapYear = bLeapYear || (year % 400 == 0);
		return bLeapYear;
	}
	
	public int getLastDayOfMonth(int month, int year)
	{
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int ld;
		boolean bLeapYear = false;
		bLeapYear = (year % 4 == 0);
		bLeapYear = bLeapYear && (year % 100 != 0);
		bLeapYear = bLeapYear || (year % 400 == 0);
		month = month -1;
		ld = days[month];
		if (bLeapYear && month ==1) ld =29;
		return ld;
	}
	public String toString(int month, int day, int year, String d)
	{
		return String.format("%2d%s%2d%s%2d",month,d,day,d,(year%100));
	}
	
	public float daysbw(int m1, int d1, int y1, int m2, int d2, int y2)
	{
		m1 = m1 - 1;
		m2 = m2 - 1;
		GregorianCalendar gc1 = new GregorianCalendar(y1,m1,d1);
		GregorianCalendar gc2 = new GregorianCalendar(y2,m2,d2);
		long myDate1 = gc1.getTimeInMillis();
		long myDate2 = gc2.getTimeInMillis();
		long millisecondsPerDay = (24*60*60*1000);
		float numberOfDays = (myDate2-myDate1)/millisecondsPerDay;
		return numberOfDays;
	
	}
	
	public float daysbw(String a, String b)
	{
		Scanner sc1 = new Scanner(a);
		sc1.useDelimiter("/");
		Scanner sc2 = new Scanner(b);
		sc2.useDelimiter("/");
		int m1 = sc1.nextInt();
		int m2 = sc2.nextInt();
		int d1 = sc1.nextInt();
		int d2 = sc2.nextInt();
		int y1 = sc1.nextInt();
		int y2 = sc2.nextInt();
		m1 = m1 - 1;
		m2 = m2 - 1;
		GregorianCalendar gc1 = new GregorianCalendar(y1,m1,d1);
		GregorianCalendar gc2 = new GregorianCalendar(y2,m2,d2);
		long myDate1 = gc1.getTimeInMillis();
		long myDate2 = gc2.getTimeInMillis();
		long millisecondsPerDay = (24*60*60*1000);
		float numberOfDays = (myDate2-myDate1)/millisecondsPerDay;
		return numberOfDays;
	
	}
	public float daysAgo(int m1, int d1, int y1)
	{
		m1 = m1 - 1;
		Date d = Calendar.getInstance().getTime();
		GregorianCalendar gc1 = new GregorianCalendar(y1,m1,d1);
		long myDate1 = gc1.getTimeInMillis();
		long myDate2 = d.getTime();
		long millisecondsPerDay = (24*60*60*1000);
		float numberOfDays = (myDate2-myDate1)/millisecondsPerDay;
		return numberOfDays;
	
	}
	public String DayOfWeek(int m, int d, int y)
	{
		GregorianCalendar gc = new GregorianCalendar(y,m-1,d);
		int dw = gc.get(gc.DAY_OF_WEEK);
		dw = dw -1;
		String days[]= {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		return days[dw];
	}
	public Date now()
	{
		Date d = Calendar.getInstance().getTime();
		return d;
	}
	public String now(String s)
	{
		Date date = Calendar.getInstance().getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(s);
	 	return sdf.format(date);
	}
	
	
	
}
