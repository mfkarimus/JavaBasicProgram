package Arraytest;

public class ArrayHW {

    public static void main(String[] args) {

        ArrayHW arraytest = new ArrayHW();

        arraytest.Test1();
        arraytest.Test2();

    }

    public void Test1() {
        int age[] = new int[10];
        age[0] = 5;
        age[1] = 8;
        age[2] = 10;
        age[3] = 12;
        age[4] = 15;
        age[5] = 18;

        //System.out.println(age[1]);

        for (int i = 0; i < age.length; i++) {

            System.out.println(age[i]);
        }

    }

    public void Test2() {

        String name[] = {"Rose","Belly","Lotus","Sunflower"};

        for (String n : name)
        {

            System.out.println(n);
        }


    }

}
