import java.util.Scanner;

public class indexLastOccurrenceIterative {
    public static int lastOccurrence(int arr[],int low,int high,int key)
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
                if(mid!=n-1 || arr[mid] != arr[mid+1])
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
