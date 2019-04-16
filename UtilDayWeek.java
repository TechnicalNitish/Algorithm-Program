package UtilityPack;

public class UtilDayWeek {
	

	public static String DayofWeek1(int d, int m, int y) 
	{
		String [] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		int y1=y-(14-m)/12;
		int x1=(y1+y1/4)-(y1/100)+(y1/400);
		int m1=m+12*((14-m)/12)-2;
		int d1=(d+x1+(31*m1)/12)%7;
		
		return days[d1];
	}

}
