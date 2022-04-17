package Arraytest;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {


    public static void main(String[] args) {

        ArrayList<String> list2=new ArrayList<String>();

        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");
        list2.add("ddd");
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");
        list2.add("ddd");
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");
        list2.add("ddd");

        System.out.println(list2);

        System.out.println("=========");

    Iterator it= list2.iterator();

    while(it.hasNext()){
        System.out.println(it.next());
    }

        System.out.println("=================");

for(String a:list2){

    System.out.println(a);
}




    }
}
