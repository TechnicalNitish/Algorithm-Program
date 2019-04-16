package UtilityPack;

public class InsertionUtil {
		
	public static void insertionSort(String s[])
	{
		for(int i=1;i<s.length;i++)
		{
			String key=s[i];
			int j=i-1;
			while(j>=0&&key.compareTo(s[j])<0)
			{
				s[j+1]=s[j];
				j--;
			}
			s[j+1]=key;
		}
		System.out.println("After Sorting List");
		for(int k=0;k<s.length;k++ )
		{
			System.out.println(s[k]);
		}
	}
}
