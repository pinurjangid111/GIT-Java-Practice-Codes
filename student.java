import java.util.Scanner;
public class student
{
       int id,cls;
       String crs;
       
void userinput()
{
    Scanner scan = new Scanner (System.in);
    System.out.print("Enter Student ID : ");
    id=scan.nextInt();
    System.out.print("Enter Student Class : ");
    cls=scan.nextInt();
    System.out.print("Enter Student course : ");
    crs=scan.next();
}
void display()
{
    System.out.println("ID is :" +id);   
    System.out.println("Class is :"+cls);
    System.out.println("Course is :"+crs);
}
public static void main(String args[])
{
    student det = new student();
    det.userinput();
    det.display();
}
}
 
 
