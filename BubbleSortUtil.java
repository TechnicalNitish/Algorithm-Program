package UtilityPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BubbleSortUtil {
	
	public static void BubbleSort()
	{
		List<Integer> al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many terms you want ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a integer value:");
			int a=sc.nextInt();
			al.add(a);
		}
		
		int a[]=new int[al.size()];
		int s=0;
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			a[s]=(int) itr.next();
			s++;
		}
		
		System.out.println("Arrays Before Sorting is as below \n :"+Arrays.toString(a));
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]>=a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		
		System.out.println("Arrays After Sorted \n :"+Arrays.toString(a));
		
		
		sc.close();
		
	}
	


}
