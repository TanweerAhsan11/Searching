import java.util.Scanner;

public class indexFirstOccurrenceIterative {
    public static int firstOccurrenceEffective(int arr[],int low,int high,int key)
    {
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
