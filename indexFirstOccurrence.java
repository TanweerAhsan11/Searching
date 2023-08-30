import java.util.Scanner;
public class indexFirstOccurrence {
    public static int firstOccurrence(int arr[],int key)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
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
        int c=firstOccurrence(arr,key);
        System.out.println(c);
    }
}
