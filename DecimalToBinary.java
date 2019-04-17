
import UtilityPack.*;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Decimal no:");
		int n=sc.nextInt();
		if(n>=2)
		{
			UtilDecimalToBinary.DecimalnoToBinary(n);
		}
		else {
			System.out.println("Galat Aakada hai:");
		}

	}

}
