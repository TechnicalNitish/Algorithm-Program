package UtilityPack;

public class UtilFareinheitAndCelcius {
	public static double FahrenheitToCelcius(int f)
	{
		double c=(f-32)*5/9;
		return c;
	}
	
	//for faenheit
	public static double CelciusTofarenheit(int c)
	{
		double f=(c*9/5)+32;
		return f;
	}

}
