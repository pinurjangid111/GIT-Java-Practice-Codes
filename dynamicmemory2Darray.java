import java.util.*;
public class dynamicmemory2Darray {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no. of Rows : ");
        int m=input.nextInt();
        System.out.println("Enter no. of Columns : ");
        int n=input.nextInt();
        int num[][]=new int[m][n];
        System.out.println("Enter "+m+"*"+n+" matrix elements");
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[0].length;j++)
            {
                num[i][j]=input.nextInt();
            }
        }
        System.out.println("You Entered : ");
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(num[i][j] + " ");
    
                }
                System.out.println();
            }

        }
    }
}
