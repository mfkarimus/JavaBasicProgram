package basicPrograms;

public class ConvertStringToInt {
    public static void main(String[] args) {

        //Converting String into int using Integer.parseInt()

        String s="500";
        System.out.println("String ="+s);
        System.out.println(s+100);

        int i=Integer.parseInt(s);
        System.out.println("Integer ="+i);
        System.out.println(i+100);


        //Converting String into Integer using Integer.valueOf() method

        System.out.println("Converting String into Integer using Integer.valueOf() method");
        String s2="700";
        System.out.println(s2+100);
        Integer i2=Integer.valueOf(s2);
        System.out.println(i2);
        System.out.println(i2+100);
    }
}
