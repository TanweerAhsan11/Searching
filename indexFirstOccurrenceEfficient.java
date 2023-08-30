import java.util.Scanner;

public class indexFirstOccurrenceEfficient {
    public static int firstOccurrenceEffective(int arr[],int low,int high,int key)
    {
        int n=arr.length;
        if(low>high)
        {
            return -1;
        }
        int mid=(low+high)/2;
        
        if(arr[mid]>key)
        {
            return firstOccurrenceEffective(arr,low,mid-1,key);
        }
        else if(arr[mid]<key)
        {
            return firstOccurrenceEffective(arr,mid+1,high,key);
        }
        else
        {
            if(mid==0 || arr[mid-1] != arr[mid])
            {
                return mid;
            }
            else{
                return firstOccurrenceEffective(arr, low, mid-1, key);  // here high=mid-1 because we have to go left half to compare.
            }
           
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int key=s.nextInt();
        int low=0;
        int high=n-1;
        
        int c=firstOccurrenceEffective(arr,low,high,key);
        System.out.println(c);
    }   
}
