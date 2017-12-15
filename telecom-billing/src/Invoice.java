import java.util.Scanner; //Name- Vishal Arora
import java.text.*;      
                      
public class Invoice {
	Scanner keyboard = new Scanner(System.in);
	DecimalFormat form = new DecimalFormat();
	private float invoiceamount = 0f;
	private float salestax = 0f;
	private float totalamountdue = 0;
	private	float totalmin = 0f;
	private	float interest = 0f;
	private int days = 0;
	private OurDate invoiceDate;
	private OurDate todaysDate;
	public Invoice() {
		 todaysDate = new OurDate();
		 invoiceDate = new OurDate();
	}

	public Invoice(int y, int m, int d) {
		 todaysDate = new OurDate(y, m, d);
		 invoiceDate = new OurDate(y, m, d);
	}

	public void setMinutesFromUser() {
		System.out.print("Enter the number of minutes you wish to purchase: ");
		totalmin = keyboard.nextFloat();
	}

	public void setDatesFromUser() {
		System.out.println("Enter Today's Date: ");
		todaysDate.setYearFromUser();
		todaysDate.setMonthFromUser();
		todaysDate.setDayFromUser();
		System.out.println("Enter Invoice Date: ");
		invoiceDate.setYearFromUser();
		invoiceDate.setMonthFromUser();
		invoiceDate.setDayFromUser();
	}
	public void dateDisplay() {
		System.out.print("\nToday's Date  : ");
			todaysDate.displayDate();
		System.out.print("Invoice Date  : ");
			invoiceDate.displayDate();
	}
	public void calculateInvoice() {
		form.applyPattern("#0.00");
		invoiceamount = 5 + (totalmin * 0.02f);
		days = ((todaysDate.calcDays()) - (invoiceDate.calcDays()));

		salestax = 0.13f * invoiceamount;

	
		if (days > 60) {
			interest = (invoiceamount * 0.10f);
		} else {
			interest = (invoiceamount * 0f);
		}
		totalamountdue = invoiceamount + salestax + interest;
		
	}

	public void displayInvoice() {
		System.out.println("\nThe number of days since invoice date: " +days);
		System.out.println ("Invoice Amount:  $" + form.format(invoiceamount));
		System.out.println ("Sales Tax     :  $" + form.format(salestax));
		System.out.println ("Interest      :  $" + form.format(interest));
		System.out.println ("Total         :  $" + form.format(totalamountdue));
	}
}