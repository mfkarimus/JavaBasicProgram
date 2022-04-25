package Arraytest;

public class ConstructorDemo {

    public  ConstructorDemo(){ //constractor

    }


    public static void sum (int a,int b){
        System.out.println(a+b);

    }
    public static void sum (int a){
        System.out.println(a+a+a+a);

    }

    public static void main(String[] args) {
       // ConstructorDemo over=new ConstructorDemo();
       // over.sum(10,20);
        //over.sum(20);



        ConstructorDemo.sum(10);

        ConstructorDemo.sum(2,3);



    }
}
