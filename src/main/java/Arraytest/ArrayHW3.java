package Arraytest;

import java.lang.reflect.Array;

public class ArrayHW3 {

    public static void main(String[] args) {

        ArrayHW3 ar=new ArrayHW3();
        ar.test();
    }
    public void test(){

        int age[]=new int[10];
        age[0]=30;
        age[1]=35;
        age[2]=40;
        age[3]=50;
        age[4]=55;

        for(int i = 0;i<age.length;i++){

            System.out.println(age[i]);

        }
        System.out.println("============");

        for(int i:age){

            System.out.println(i);

        }
    }
}
