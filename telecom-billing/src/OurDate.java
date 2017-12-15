//Name- Vishal Arora
import java.util.Scanner;

public class OurDate {
	private int year;
	private int month;
	private int day;

	public OurDate (int m, int d, int y) {
		year = y;
		month = m;
		day = d;
	}
	public OurDate() {
		year = 1900;
		month = 1;
		day = 1;
	}

	public void setYearFromUser() {
		   Scanner input = new Scanner (System.in);
		   System.out.print("Enter a valid year: ");
		   year = input.nextInt();
	}
	
	public void setMonthFromUser() {
	   Scanner input = new Scanner (System.in);
	   System.out.print("Enter the month: ");
	   month = input.nextInt();
	}

	public void setDayFromUser() {
	   Scanner input = new Scanner (System.in);
	   System.out.print("Enter the day: ");
	   day = input.nextInt();
	}

	public void displayDate() {
		System.out.println (year + "/" + month + "/" + day);
	}
	
	public int calcDays(){
		return ((year-1)*365)+((month-1)*30)+(day);
	}
}