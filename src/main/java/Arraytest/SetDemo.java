package Arraytest;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {

        HashSet<String> list=new HashSet<String>();

        list.add("Rose");
        list.add("Belly");
        list.add("Lotus");
        list.add("Rose");
        list.add("Belly");
        list.add("Lotus");
        list.add("Rose");
        list.add("Belly");
        list.add("Lotus");

        System.out.println(list);

        for(String i:list){
            System.out.println(i);
        }
    }
}
