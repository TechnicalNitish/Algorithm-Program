import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import UtilityPack.*;
public class BinarySearchfromFile {

	public static void main(String[] args) throws IOException {
		File f=new File("abc.txt");
        Scanner sc=new Scanner(f);
         Scanner input=new Scanner(System.in);
           int l=(int) f.length();
           String s1[]=new String[l];
           int c=0;
        while(sc.hasNext())
        {
            //System.out.println(sc.next());
            String s=sc.next();
            s1[c]=s;  
            c++;
        }
        System.out.println("Before Sorting");
        for(int i=0;i<c;i++)
        System.out.println(""+s1[i]);
        
        BinarySearchUtil.SortingBeforeSearch(s1, c);
       
        
        //After Sorting:
         System.out.println("After Sorting");
             for(int i=0;i<c;i++)
             System.out.println(""+s1[i]);
             int l1=s1.length;
             //Searching 
             System.out.println("Enter to search:");
             String search=input.nextLine();
             BinarySearchUtil.BinarySearch(s1, search, c);
             
             sc.close();
             input.close();
        
	}

}
