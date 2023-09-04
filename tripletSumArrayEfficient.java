import java.util.Scanner;

public class tripletSumArrayEfficient {
    public static boolean isPair(int arr[],int key,int start)
    {
        int n=arr.length;
        int i=start, j=n-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==key)
            {
                return true;
            }
            else if(arr[i]+arr[j]>key)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return false;
    }
    public static boolean tripletSumEfficient(int arr[],int key)
    {
        int n=arr.length;
        for(int i=0;i<n-2;i++)
        {
            if(isPair(arr,key-arr[i],i+1))
            {
                return true;
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
        boolean c=tripletSumEfficient(arr,key);
        System.out.println(c);
    }
}
