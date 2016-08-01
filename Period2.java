
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





