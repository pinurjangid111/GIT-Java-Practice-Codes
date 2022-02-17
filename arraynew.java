import java.util.*;
public class arraynew {
    public static void main(String args[])
    {   
        pos.disp();
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
    class cube
    {
        void disp()
        {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter no. of rows : ");
            int p=obj.nextInt();
            System.out.println("Enter no. of Columns : ");
            int q=obj.nextInt();
            int a[][]=new int[p][q];
            System.out.println("Enter "+p+"*"+q+" matrix elements :");
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[0].length;j++)
                {
                    a[i][j]=obj.nextInt();
                }
            }
            System.out.println("Display output : ");
            for(int i=0;i<p;i++)
            {
                for(int j=0;j<q;j++)
                {
                    System.out.print(a[i][j]+ " ");
                }
                System.out.println();
            }

        }
    }
}
