import java.util.Scanner;

public class twoPointerApproachEfficient {
    public static boolean twoPointerApproach(int arr[],int key)
    {
        int n=arr.length;
        int i=0 , j=n-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==key)
            {
                return true;
            }
            else if(arr[i]+arr[j]>key)
            {
                j=j-1;
            }
            else        //if (arr[i]+arr[j] < key)
            {
                i=i+1;
            }
        }
        return false;
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
        boolean c=twoPointerApproach(arr,key);
        System.out.println(c);
    }
}
