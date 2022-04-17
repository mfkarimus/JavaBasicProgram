package Arraytest;

import java.util.HashSet;

public class SetDemo2 {
    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(102);
        hs.add(103);

        for(Integer i:hs){
            System.out.println(i);
        }
    }
}
