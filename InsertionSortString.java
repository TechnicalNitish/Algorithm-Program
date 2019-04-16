import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import UtilityPack.*;
public class InsertionSortString {

	
		public static void main(String[] args) throws IOException {
			List<String> al=new ArrayList();
			Scanner sc=new Scanner(System.in);
			System.out.println("How many Words you want to add:");
			int a=sc.nextInt();
			
			for(int i=0;i<a;i++)
			{
				System.out.println("Input word to add");
				String w=sc.nextLine();
				al.add(w);
			}
			
			
			InsertionUtil.insertionSort(al.toArray(new String[0]));
			sc.close();
	}

}
