import java.util.Scanner;

public class searchInInfiniteEffective {

    public static int binarySearch(int arr[],int key,int low,int high)
    {
        int n=arr.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]>key)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static int infiniteSearch(int arr[],int key)
    {
        if(arr[0]==key)
        {
            return 0;
        }
        int i=1;
        while(arr[i]<key)
        {
            i=i*2;
        }
        if(arr[i]==key)
        {
            return i;
        }
        int low=(i/2)+1;
        int high=i-1;
        return binarySearch(arr,key,low,high);
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
        // for(int i=0;i<n;i++)
        // {
        //     int low=(i/2)+1;
        //     int high=i-1;
        // }
        infiniteSearch(arr,key);
        System.out.println(infiniteSearch(arr,key));
    }
}
