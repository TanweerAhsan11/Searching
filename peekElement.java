import java.util.Scanner;

public class peekElement {
    public static int peekElement(int arr[])
    {
        int n=arr.length;
        if(n==1)
        {
            return arr[0];
        }
        if(arr[0]>=arr[1])
        {
            return arr[0];
        }
        if(arr[n-1]>=arr[n-2])
        {
            return arr[n-1];
        }
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                return arr[i];
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
        int c=peekElement(arr);
        System.out.println(c);
    }
}
// O(n)