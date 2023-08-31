import java.util.Scanner;

public class squareRootEffective {
    public static int squareRootEffective(int num)
    {
        
        int low=0;
        int high=num;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int midSquare=mid*mid;
            if(midSquare==num)
            {
                return mid;
            }
            else if(midSquare>num)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
     public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int c=squareRootEffective(num);
        System.out.println(c);
    }
}


/*
 *  In this we initialize ans=-1 and calculate mid and calculate its square (mid*mid).
 *  If midSquare is equal to number then mid is the square root of number, return mid;
 *  If midSquare is > num neglect right side and make high=mid-1;
 *  If midSquare is < num neglect left side and make low=mid+1; and store mid in ans, i.e ans=mid;
 */
