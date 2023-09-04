import java.util.Scanner;

public class tripletSumArray {
    public static boolean tripletSum(int arr[],int key)
    {
        int n=arr.length;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==key)
                    {
                        return true;
                    }
                }
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
        boolean c=tripletSum(arr,key);
        System.out.println(c);
    }
}
