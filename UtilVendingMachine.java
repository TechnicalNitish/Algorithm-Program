package UtilityPack;

import java.util.HashMap;
import java.util.Map;

public class UtilVendingMachine {
	
	public static void machineVending(int n)
	{
		Map map=new HashMap();
			int arr[]= {2000,500,200,100,50,20,10,5,2,1};
			int i=0;
			while(i<arr.length)
			{
				if(n/arr[i]>0)
				{
					map.put(arr[i],n/arr[i]);
					n=n%arr[i];
				}
				i++;
			}
		System.out.println(map);
	}

}
