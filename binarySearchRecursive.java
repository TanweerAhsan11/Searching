import java.util.Scanner;

public class binarySearchRecursive {
    public static int binarySearch(int arr[], int key, int low,int high)
    {
            if(low>high){
                return -1;
            }
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]>key)
            {
               return binarySearch(arr, key, low,mid-1);
            }
            else{
                return binarySearch(arr, key, mid+1, high);
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
        int low=0;
        int high=n-1;
        int key=s.nextInt();
        binarySearch(arr,key,low,high);
        System.out.println(binarySearch(arr,key,low,high));
    }
}
