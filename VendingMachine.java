import java.util.Scanner;
import UtilityPack.*;
public class VendingMachine {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		int num=0;
		try {
			System.out.println("Kitne paise ka chhutta chahiye:");
			num=sc.nextInt();
			
			
			UtilVendingMachine.machineVending(num);
		}catch(Exception e)
		{
			System.out.println("Black Money");
			e.printStackTrace();
			System.exit(0);
		}
	

	}

}
