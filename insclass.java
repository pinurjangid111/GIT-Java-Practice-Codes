class insclass {
    public static void main(String args[])
    {
        Addition obj= new Addition();
        obj.disp(20,30,40);
    }    
}

class Addition
{
    void disp(int a,int b,int c)
    {
        int x= a,y=b,z=c;
        int d= x+y+z;
        System.out.println("Addition is : "+d);
    }
}
