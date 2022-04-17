package Arraytest;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ArrayHW2 {
    public static void main(String[] args){

        ArrayHW2 arraytest=new ArrayHW2();

        arraytest.Test();

    }
    public void Test(){

        int numberGrid[][]= {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {0}
        };

        for(int i=0;i<numberGrid.length;i++){
            for(int j=0;j<numberGrid[i].length;j++)
                System.out.println(numberGrid[i][j]);
        }
        System.out.println();
    };
}
