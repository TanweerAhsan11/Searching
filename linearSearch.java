import java.util.Scanner;
public class linearSearch{

    public static int linearSearch(int arr[],int key)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == key)
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
        linearSearch(arr,key);
        System.out.println(linearSearch(arr,key));
    }
}