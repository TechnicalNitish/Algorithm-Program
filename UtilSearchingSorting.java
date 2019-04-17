package UtilityPack;

import java.util.Arrays;
import java.util.Scanner;

public class UtilSearchingSorting {

    //Bubble Sort of Integer value:
   public static void BubbleSortInteger(int arr[])
    {
        int w=arr.length;
        for(int i=0;i<w;i++)
        {
            for(int j=i+1;j<w;j++)
            {
                if(arr[i]>arr[j])
                {
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
            
        }
        
       
        System.out.println("After bubble sort of Integer \n "+Arrays.toString(arr));
    }
   
   //Bubble Sort of String Value
   
    public static void BubbleSortString(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i].compareTo(arr[j])<0)
                {
                    String t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        
        
        System.out.println("After Sorting of String Value:\n"+Arrays.toString(arr));
        
    }
   
   //Insertion Sort of Integer value
   
   public static void InsertionSortInteger(int arr[])
   {
       for(int i=1;i<arr.length;i++)
       {
          int key=arr[i];
            int j=i-1;
            
            while(j>=0&&key<arr[j])
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
            
       }
      
       System.out.println("\nAfter Insertion sort of Integer value\n "+Arrays.toString(arr));
   }
   
   public static void InsertionSortString(String arr[])
   {
       for(int i=1;i<arr.length;i++)
       {
          String key=arr[i];
          int j=i-1;
          
          while(j>=0&&key.compareTo(arr[j])<0)
          {
              arr[j+1]=arr[j];
              j=j-1;
          }
          arr[j+1]=key;
       }
      
       System.out.println("After Sorting using Insertin String\n"+Arrays.toString(arr));
       
       
   }
   
   
   //Binary Search using Selection  Sort 
   
  public static void BinarySearchInteger(int arr[])
  {
      for(int i=0;i<arr.length;i++)
      {
         int min=i;
          for(int j=i+1;j<arr.length;j++)
          {
              if(arr[j]<arr[min])
              {
                  min=j;
              }
          }
          
          int t=arr[min];
          arr[min]=arr[i];
          arr[i]=t;
      }
      
      System.out.println("After sorting \n"+Arrays.toString(arr));
      
      
      int first=0;
      int last=arr.length-1;
      int mid=(first+last)/2;
      Scanner sc=new Scanner(System.in);
      System.out.println("ENter a value to search:");
      int search=sc.nextInt();
      int flag=0;
     while(first<=last)
     {
         if(arr[mid]==search)
         {
             flag=1;
             break;
         }
         else if(search<arr[mid]){
             last=mid-1;
         }
         else if(search>arr[mid]){
             first=mid+1;
         }
         mid=(first+last)/2;
     }
     
     if(flag==1)
     {
         System.out.println("\nIs Found");
     }
     else
     {
         System.out.println("NOt Available");
     }
    
      
  }
  //Binary Search for String
  public static void BinarySearchString(String a[])
  {
      Arrays.sort(a);
      System.out.println(""+Arrays.toString(a));
      int first=0;
      int last=a.length-1;
      int mid=(first+last)/2;
      System.out.println("\nEnter value to Search");
      Scanner sc=new Scanner(System.in);
      String search=sc.nextLine();
      int f=0;
      while(first<=last)
      {
          if(a[mid].equals(search))
          {
              f=1;
              break;
          }
          else if(a[mid].compareTo(search)<0)
          {
              first=mid+1;
          }
          else if(a[mid].compareTo(search)>0)
          {
              last=mid-1;
          }
          
          mid=(first+last)/2;
      }
      
      if(f==1)
      {
          System.out.println("Is Found");
      }
      else
      {
          System.out.println("\nNt found");
      }
      
  }
  //Method for Current time
  
  public static long WatchMethod()
	{
		long start=System.currentTimeMillis();
		System.out.println("Current TIme is :"+java.time.LocalTime.now());
		return start;
	}
  //Elapse Time Method
  public static long elapsedTime(long t1)
  {
	  
	  long elapsed=(System.currentTimeMillis()-t1)/1000;
	  System.out.println("Elapsed Time in MilliSecond "+elapsed);
	  return elapsed;
	  
  }

}
