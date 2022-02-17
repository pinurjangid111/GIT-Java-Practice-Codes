import java.util.*;
public class userinput2Darray {
        public static void main(String args[])
        {
            Scanner input=new Scanner(System.in);
            int[][] a= new int [3][3];
            System.out.println("Enter 3*3 matrix elements : ");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    a[i][j]=input.nextInt();
                }
            } 
            System.out.println("You Entered : ");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(a[i][j]+ " ");
                }
                System.out.println();
            }
        }
    
}
