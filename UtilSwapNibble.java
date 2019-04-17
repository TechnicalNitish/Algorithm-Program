package UtilityPack;

public class UtilSwapNibble {

	
	static int arr[]=new int[8];
	static int binary1[]=new int[8];
	public static int[] toBinary(int n)
	{
		int i=0;
		while(n>0)
		{
			int rem=n%2;
			arr[i]=rem;
			n=n/2;
			i++;			
		}
		for(int k=0;k<arr.length-1;k++)
		{
			binary1[k]=arr[arr.length-k-1];
		}
		
		
		return binary1;
	}
	
	
	//SwapNibbes
	public static int[] showNibbles(int a[])
	{
			int temp, j=a.length-4;
			
			for(int i=0;i<4;i++)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
			
			return a;
	}

	//Power of two
	
	public static boolean powerof2(int n)
	{
		int temp=0,i=1,c=0;
		while(temp<n)
		{
			temp=(int)Math.pow(2, i);
			if(temp==n)
			{
				c++;
				break;
				
			}
			i++;
		}
		if(c==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
