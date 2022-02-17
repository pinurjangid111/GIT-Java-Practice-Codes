
public class methodoverloading {
        public static void main(String args[])
        {
            Addition obj = new Addition();
            obj.disp(10, 10);
            obj.disp(5, 5.0f);
        }
    }
    class Addition
    {
        void disp(int a, int b)
        {
            int x=a,y=b;
            int z=x+y;
            System.out.println("Addition is :"+z);
        }
        void disp(int a, float b)
        {
            int x=a;
            float y=b;
            float z=x*y;
            System.out.println("Multiplication is : "+z);
        }
    }
