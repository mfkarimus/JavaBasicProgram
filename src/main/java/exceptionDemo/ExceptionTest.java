package exceptionDemo;

public class ExceptionTest {
    public static void main(String[] args) {

        try {
            int  age[]=new int[2];
            age[0]= 10;
            age[1]=11;
            age[2]=12;

            int a=100;
            int b=0;
            int total=a/b;
            System.out.println("Total value = "+total);


        }
        catch(ArithmeticException e)
        {
            System.out.println("Can not be divided by zero");
        }

        catch(NullPointerException e)
        {
            System.out.println("Number can not be null");
        }

        catch(NumberFormatException e)
        {
            System.out.println("Number format Exception");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        catch(Exception e)
        {
            System.out.println(" Exception");
        }

finally {
            System.out.println("Finally block always execute");
        }

    }
}
