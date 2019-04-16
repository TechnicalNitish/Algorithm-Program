package UtilityPack;

public class BinarySearchUtil {
		
	public static void SortingBeforeSearch(String s1[],int c)
    {
             
       for(int i=0;i<c;i++)
       {
           for(int j=i+1;j<c;j++)
           {
                        if(s1[i].compareTo(s1[j])>0)
                       {
                           String t=s1[i];
                           s1[i]=s1[j];
                           s1[j]=t;
                       }
           }
       }
      
    }
    
    //Binary search Function
    
    public static void BinarySearch(String s1[],String search,int c)
    {
        int first=0;
        int last=c-1;
        int mid=(first+last)/2;
        int f=0;
        while(first<=last)
        {
            if(search.compareTo(s1[mid])==0)
            {
                
                f=1;
                break;
            }
            else if(s1[mid].compareTo(search)>0)
            {
                
               last=mid-1;
            }
            else if(s1[mid].compareTo(search)<0)
            {
               first=mid+1;
              
            }
          mid=(first+last)/2;      
        }
        
        if(f==1)
        {
            System.out.println("found");
        }else
        {
            System.out.println("Not Found");
        }
                
    }

}
