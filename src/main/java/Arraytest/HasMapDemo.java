package Arraytest;

import java.util.HashMap;
import java.util.Map;

public class HasMapDemo {
    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<Integer,String>();

        hm.put(201,"Rose");
        hm.put(202,"Belly");
        hm.put(203,"Lotus");
        hm.put(204,"Sun flower");

        for(Map.Entry pp:hm.entrySet()){

            System.out.println(pp.getKey()+"="+pp.getValue());
        }
    }

}
