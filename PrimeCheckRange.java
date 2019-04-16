import java.util.Scanner;
import UtilityPack.*;
public class PrimeCheckRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter range 0 to 1000");
	      
	       int first=sc.nextInt();
	       int second=sc.nextInt();
	       System.out.println("Displaying prime Number between "+first+" to "+second);
	       PrimeChecker.prime(first,second);
	       sc.close();
	}

}
