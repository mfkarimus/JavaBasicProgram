package Arraytest;

import java.util.HashMap;
import java.util.Map;

public class HasMapDemo3 {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<Integer,String>();
        hm.put(501,"fff");
        hm.put(502,"kkk");
        hm.put(503,"mmm");

        for(Map.Entry pp: hm.entrySet()){
            System.out.println(pp.getValue());
        }

    }
}
