package UtilityPack;

public class UtilDecimalToBinary {
	public static void DecimalnoToBinary(int n)
	{
		int arr[]=new int[10];
		int i=0;
		while(n>0)
		{
			int rem=n%2;
			arr[i]=rem;
			n=n/2;
			i++;
		}
		System.out.println("Decimal to Binary of given no is as below :");
		
		for(int j=i-1;j>=0;j--)
		{
			System.err.print(arr[j]);
		}
	}
}
