import UtilityPack.*;
import java.util.*;
public class SwapNibble {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int decimalno=sc.nextInt();
	
		
		int arr1[]=UtilSwapNibble.toBinary(decimalno);
		
				
		
		//After Conversion Of Binary array is
		
		System.out.println("After Binary Converstion");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]);
		}
		
		//nibbles;
		
		int b[]=UtilSwapNibble.showNibbles(arr1);
		
		
		System.out.println("\nAfter nibbles ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
			
			
		}
		
		//Power Of Two 
		boolean s=UtilSwapNibble.powerof2(decimalno);
		
		if(s==true)
		{
			System.out.println("\n"+decimalno+" \nis Power of two");
		}else
		{
			System.out.println("\n Not power of two");
		}
		

	}

}
