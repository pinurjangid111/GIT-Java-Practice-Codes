	 package employee1;
     import java.util.*;
	  class employee
      {  
            String name;   
 			public void show(String s)
 {  
	  	  	if(s=="")  
	  	  	  	System.out.println("unknown");  
	  	  	else  
	  	  	  	System.out.println(s);  
	  	}  
}  
public class Employee1 {    	
public static void main(String[] args) {  
  	  	  
  	  	employee obj= new employee();  
	  	  Scanner sc= new Scanner(System.in);  
  	  	System.out.println("enter the no. of the names");    	
              	int n= sc.nextInt();  
  	  	     sc.nextLine();  
  	  	System.out.println("enter the names");  
    	for(int i=0; i<n; i++)  
	  	{  
  	  	  	obj.name= sc.nextLine();
            obj.show(obj.name);  
	  	  	}  
	  	}  
    }
