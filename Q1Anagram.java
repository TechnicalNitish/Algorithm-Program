import java.util.Arrays;
import UtilityPack.*;
import java.util.Scanner;
public class Q1Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter String1 And String 2");
		 String s1=sc.nextLine();
         String s2=sc.nextLine();
         //String to char
         int l1=s1.length();
         int l2=s2.length();
         char str1[]=s1.toCharArray();
         char str2[]=s2.toCharArray();
        
         //Sorting and converting 
                 Arrays.sort(str1);
                  Arrays.sort(str2);

         //converting char to string
         String s3= new String(str1);
         String s4= new String(str2);
         System.out.println(s1);
         System.out.println(s2); 
         AnagramUtil.anagramChecker(s3,s4,l1,l2);
         sc.close();
         
	}

}
