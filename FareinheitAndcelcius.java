import java.util.Scanner;
import UtilityPack.*;
public class FareinheitAndcelcius {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Celcius Value:");
			int c=sc.nextInt();
			System.out.println("Enter Fahrenheit Value:");
			int f=sc.nextInt();
			
		System.out.println("Celcius to fahreinheit :"+UtilFareinheitAndCelcius.CelciusTofarenheit(c));
		System.out.println("\nfahreinheit To Celcius :"+UtilFareinheitAndCelcius.FahrenheitToCelcius(f));
		sc.close();	
	}

}
