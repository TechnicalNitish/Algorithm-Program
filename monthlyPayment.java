import UtilityPack.UtilMonthlyPayment;

public class monthlyPayment {

	public static void main(String[] nit) {
		int P=Integer.parseInt(nit[0]);
		int Y=Integer.parseInt(nit[1]);
		int R=Integer.parseInt(nit[2]);
		
		System.out.println(UtilMonthlyPayment.monthlypayment(P, Y, R));
		

	}

}
