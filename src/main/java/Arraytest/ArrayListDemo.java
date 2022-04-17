package Arraytest;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();

        list.add("Rose");
        list.add("Belly");
        list.add("Lotus");
        list.add("Rose");
        list.add("Belly");
        list.add("Lotus");

        Iterator itr=list.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());
        }
        System.out.println(list);

        for(String a:list){

            System.out.println(a);
        }

/*
        ArrayList<Integer> list2=new ArrayList<Integer>();

        list2.add(201);
        list2.add(202);
        list2.add(203);
        list2.add(201);
        list2.add(202);
        list2.add(203);
        list2.add(201);
        list2.add(202);
        list2.add(203);

        System.out.println(list2);*/
    }
}
