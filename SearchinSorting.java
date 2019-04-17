import java.util.Arrays;
import java.util.Scanner;

import UtilityPack.*;
public class SearchinSorting {
		static long t;
	public static void main(String[] args) {
		int choice=1;
		System.out.println("1.Bubble Sort of Integer And String\n"
				+ "2.Insertion Sort Of Integer And String\n"
				+"3.BinarySearch Of Integer and String\n"
				+"0.Exit ");
		
		do {
			System.out.println("\nEnter your choice From Above List:");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice) 
			{
			
			
			case 1: t= UtilSearchingSorting.WatchMethod();
				int a[]={21,34,78,12,8,2,23,14};
	        System.out.println("Before bubble sort of Integer array is:\n "+Arrays.toString(a));
	        UtilSearchingSorting.BubbleSortInteger(a);
	        			
	        
	        String s[]={"nitish","rahul","abc","bca","mn","bc"};
	        System.out.println("Before Sorting"+Arrays.toString(s));
	        
	        
	        UtilSearchingSorting.BubbleSortString(s);
	        
	        		break;
	        		
			case 2:t=UtilSearchingSorting.WatchMethod();
	        //Insertion sort program
	        int b[]={12,10,5,1,23,45,13,1};
	        UtilSearchingSorting.InsertionSortInteger(b);
	        String s1[]={"nit","abc","key","str","zx"};
	        UtilSearchingSorting.InsertionSortString(s1);
	        UtilSearchingSorting.elapsedTime(t);
	        		break;
	        
	        //BInary search (Selection sort)
			case 3:  t=   UtilSearchingSorting.WatchMethod();
				int c[]={21,3,12,8,34,52,7,25};
	        UtilSearchingSorting.BinarySearchInteger(c);
	        
	        String s2[]={"king","chor","sipahi","pkmb","abc","ghi"};
	        UtilSearchingSorting.BinarySearchString(s2);
	        UtilSearchingSorting.elapsedTime(t);
	        		break;
			case 0: System.exit(0);
			
	       default :System.out.println("Please Enter Valid Choice");
	        
			}
			
		}while(choice!=0);
	}

}
