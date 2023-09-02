import java.util.Scanner;

public class sortedRotatedArray {
    public static int searchRotated(int arr[],int key)
    {
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                return mid;
            }

            if(arr[low] <= arr[mid])
            {
                //left half is sorted.
                //if left half is sorted check if key element lies in that range.
                if(key >= arr[low] && key < arr[mid])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else
            {
                //right half is sorted.
                if(key > arr[mid] && key <= arr[high])
                {
                    low=mid+1;
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
        int c=searchRotated(arr,key);
        System.out.println(c);
    }
}
