import java.util.Scanner;

public class indexLastOccurrence {
    public static int lastOccurrence(int arr[],int key)
    {
        int n=arr.length;
        for(int i=n-1;i>0;i--)
        {
            if(arr[i]==key)
            {
                return i;
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
        int c=lastOccurrence(arr,key);
        System.out.println(c);
    }
}
