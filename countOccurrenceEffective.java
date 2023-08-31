import java.util.Scanner;

public class countOccurrenceEffective {
    public static int firstOccurrenceEffective(int arr[],int low,int high,int key)
    {
        int n=arr.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>key)
            {
                high=mid-1;
            }
            else if(arr[mid]<key)
            {
                low=mid+1;
            }
            else
            {
                if(mid==0 || arr[mid-1] != arr[mid])
                {
                    return mid;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public static int lastOccurrenceEffective(int arr[],int low,int high,int key)
    {
        int n=arr.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>key)
            {
                high=mid-1;
            }
            else if(arr[mid]<key)
            {
                low=mid+1;
            }
            else
            {
                if(mid==n-1 || arr[mid] != arr[mid+1])
                {
                    return mid;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }

    public static int Occurrence(int arr[],int low,int high,int key)
    {
        int n=arr.length;
        int first=firstOccurrenceEffective(arr,low,high,key);
        if(first==-1)
        {
            return 0;
        }
        else{
            return (lastOccurrenceEffective(arr,low,high,key) - first + 1);
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
        int low=0,high=n-1;

        int c=Occurrence(arr,low,high,key);
        System.out.println(c);
    }
}
