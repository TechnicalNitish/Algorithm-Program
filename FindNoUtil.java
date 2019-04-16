package UtilityPack;

public class FindNoUtil {
	
	public static void sum(int n ,int arr[])
    {
        int sum=2;
            int c=0;
        for(int i=1;i<=n;i++)
            {
                System.out.println("2^"+i+" ="+sum);
                arr[c]=sum;
                c++;
                sum=sum*2;
                
            }
    }
    public static void displayarray(int arr[],int n)
    {
         System.out.println("\nDisplaying Arrays Below");
            for(int i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
        
    }
    
    public static void seacrhing(int arr[],int search,int n)
    {
         if(search<=arr[n-1]&&search>=2)
            {
                System.out.println(true+"Searching....");
                   int first=0;
                    int last=n-1;
                    int mid=(first+last)/2;
                    int f=0;
                    while(first<=last)
                    {
                        if(search==arr[mid])
                        {
                            f=1;
                            break;
                        }
                        else if(search<arr[mid])
                        {
                            last=mid-1;
                        }
                        else if(search>arr[mid])
                        {
                            first=mid+1;
                        }
                        
                        mid=(first+last)/2;
                    }
               if(f==1)
               {
                   System.out.println("is Found at ps : "+mid);
               }
               else
               {
                   System.out.println("Not Found");
               }
               
            }
            else
            {
                System.out.println(false+"Canot seacrh");
            }
    }      
        
}
