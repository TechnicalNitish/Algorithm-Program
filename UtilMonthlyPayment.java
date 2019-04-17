package UtilityPack;

public class UtilMonthlyPayment {
	public static double monthlypayment(int P,int Y,int R)
	{
		double n=12*R;
		double r=R/(12*100);
		double payment=(P*R)/1-Math.pow(1+r,-n);
		return payment;
	}

}
