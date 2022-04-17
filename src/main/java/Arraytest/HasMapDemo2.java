package Arraytest;

import java.util.HashMap;
import java.util.Map;

public class HasMapDemo2 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm2=new HashMap<String,Integer>();

        hm2.put("aa",101);
        hm2.put("bb",202);
        hm2.put("cc",203);
        hm2.put("dd",204);

       for(Map.Entry pp: hm2.entrySet()){
           System.out.println(pp.getKey()+"="+pp.getValue());
       }
    }
}
