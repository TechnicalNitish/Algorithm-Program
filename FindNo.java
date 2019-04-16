import java.util.Scanner;

import UtilityPack.*;
public class FindNo {

	public static void main(String[] args) {
		try {
		int n=Integer.parseInt(args[0]);
        int arr[]=new int[n];
        //static function of printing n exponent

        FindNoUtil.sum(n, arr);
        
       //static function of Displaying Array
        FindNoUtil.displayarray(arr, n);
       
       
       System.out.println("ENter a value to search");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
       //static function of Searching value using binary;

        FindNoUtil.seacrhing(arr, s, n);
        sc.close();
        
}catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("Please Pass The Command Line Argume for N");
}
	}

}
