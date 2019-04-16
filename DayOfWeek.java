import java.util.Scanner;
import UtilityPack.*;
public class DayOfWeek {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day , month and year :");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		
		String s=UtilDayWeek.DayofWeek1(d,m,y);
		System.out.println(s);
		sc.close();
	}

}
