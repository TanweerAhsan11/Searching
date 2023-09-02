import java.util.Scanner;

public class peekElementEficient {

    public static int peekElement(int arr[])
    {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(mid==0 || arr[mid-1] <= arr[mid] && mid==n-1 || arr[mid+1] <= arr[mid])
            {
                //checking if mid is peek element.
                return mid;
            }
            if(mid > 0 && arr[mid-1] >= arr[mid])
            {
                //if arr[mid-1] > arr[mid]. Left side have peek element.
                high=mid-1;
            }
            else
            {
                //else if arr[mid+1] > arr[mid]. Right side have peek element.
                low=mid+1;
            }
        }
        return 0;
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
        int c=peekElement(arr);
        System.out.println(c);
    }
}
// O(log n).