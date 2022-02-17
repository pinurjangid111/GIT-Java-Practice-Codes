import java.util.Scanner;
public class areaofrectangle
{
    public static void main (String args[])
    {
        Scanner obj= new Scanner(System.in);
        int height;
        int width;
        int area;
        System.out.print("Enter height : ");
        height = obj.nextInt();
        System.out.print("Enter width : ");
        width = obj.nextInt();
        System.out.println("Height:" +height);
        System.out.println("Width:" +width);
         area=width*height;
        System.out.println("Area of Rectangle : "+area);
    } 
}
        