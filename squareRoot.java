import java.util.Scanner;

public class squareRoot {
    public static int squareRoot(int num)
    {
        int i=1;
        while(i*i <= num)
        {
            i++;
        }
        return (i-1);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int c=squareRoot(num);
        System.out.println(c);
    }
    
}
