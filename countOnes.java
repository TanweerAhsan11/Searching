import java.util.Scanner;

public class countOnes {
    public static int countOnes(int arr[],int low,int high)
    {
        int n=arr.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==0)
            {
                low=mid+1;
            }
            else{
                if(mid==0 || arr[mid-1]==0)
                {
                    return (n-mid);
                }
                else{
                    high=mid-1;
                }
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
        int low=0;
        int high=n-1;
        int c=countOnes(arr,low,high);
        System.out.println(c);
    }
}
