package UtilityPack;

public class PrimeChecker {
	 public static void prime(int f,int l)
	    {
	        
	        for(int i=f;i<=l;i++)
	        {
	            int flag=0;
	           for(int j=2;j<=i/2;j++)
	           {
	               if(i%j==0)
	               {
	                   flag=1;
	               }
	           }
	           if(flag==0)
	           {
	               System.out.println(""+i);
	           }
	        }
	    }

}
