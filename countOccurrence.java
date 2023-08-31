import java.util.Scanner;

public class countOccurrence {
    public static int Occurrence(int arr[],int key)
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                count++;
            }
            
        }
        return count;
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
        int c=Occurrence(arr,key);
        System.out.println(c);
    }   
}
