import java.util.Scanner;
public class binarySearch{

    public static void binarySearchNaive(int arr[],int key)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == key)
            {
                System.out.println(i);
            }
        }
        System.out.print(-1);

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
        binarySearchNaive(arr,key);
    }
}