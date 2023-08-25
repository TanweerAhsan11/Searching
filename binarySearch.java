import java.util.Scanner;

public class binarySearch {
    public static int binarySearch(int arr[],int key)
    {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]>key)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
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
        binarySearch(arr,key);
        System.out.println(binarySearch(arr,key));
    }
}
