package UtilityPack;

public class AnagramUtil {

		public static void anagramChecker(String s3 ,String s4,int l1,int l2)
		{
			
			if(l1==l2)
	         {
	                 if(s3.equals(s4))
	                 {
	                     System.out.println("Is Anagram");
	                 }
	                 else {
	                	 System.out.println("is  Not Anagram");
	                 }
	         }
	         else{
	             System.out.println("LengthIsNotEqual");
	         }

		}
}
