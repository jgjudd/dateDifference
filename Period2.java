
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Period2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("We are about to find the amount of time between two dates...");
		
		System.out.println("Please enter Date #1 (yyyy-mm-dd):"); //Date #1
		String Date1 = scanner.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		LocalDate x = LocalDate.parse( Date1 , formatter); // Turns input from string to date and formats it like yyyy-mm-dd
		
		System.out.println("Please enter Date #2 (yyyy-mm-dd):"); //Date #2
		String Date2 = scanner.nextLine();

		LocalDate y = LocalDate.parse( Date2 , formatter );
		//Format ISO_LOCAL_DATE applies here as well
		
		Period p = Period.between( x , y ); // p = date x - date y
		
		
		int Days = Math.abs(p.getDays() );
		int Months = Math.abs(p.getMonths() ); // (math.abs) prints absolute values so chronological order of dates doesn't matter
		int Years = Math.abs(p.getYears() );
		
		System.out.println("There are " + Days + " days, " + Months + " months, and " + Years + " years between " + Date1 + " and " + Date2 ); 
	}	
}




/* X - 1. Create a Scanner (done)
* X - 2. Ask for user for input and get two dates as inputs as Strings (done)
* X - 3. Set up DateTimeFormatter with the format you're expecting (usually MM/dd/yyyy)'
* X - 4. Create two LocalDates using LocalDate.parse with an input and the DateTimeFormatter.abstract
* 5. Use the Period.between() method to create a new Period instance with the difference between the dates
* 		Period p = Period.between(date1, date2)
*	p is an instance--a specific Period with days, months, years. 
* 	You're asking the Period class (static method) to build you one. 
*	so it's Period.between()
*	but then it will be the instance for the rest--
*	p.getMonth(), p.getDays(), etc. 
* 6. Use the instance's methods to get years, months, days, and output them.  
*/ 
