import java.util.Scanner;

public class indexLastOccurrenceEffective {
    public static int lastOccurrence(int arr[],int low,int high,int key)
    {
        int n=arr.length;
        if(low>high)
        {
            return -1;
        }
        int mid=(low+high)/2;

        if(arr[mid]>key)
        {
            return lastOccurrence(arr, low, mid-1, key);
        }
        else if(arr[mid]<key)
        {
            return lastOccurrence(arr, mid+1, high, key);
        }
        else
        {
            if(mid==n-1 || arr[mid] != arr[mid+1])
            {
                return mid;
            }
            else
            {
                return lastOccurrence(arr, mid+1, high, key);
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
        int c=lastOccurrence(arr,low,high,key);
        System.out.println(c);
    }
}
