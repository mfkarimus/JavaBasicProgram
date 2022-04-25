package basicPrograms;

public class SmallestElementsArray {
    public static void main(String[] args) {

        //Initialize array
        int [] arr=new int[]{2,25,30,50,75,100};
        int small=arr[0];

        for (int i=0;i<arr.length;i++){

            if(arr[i]<small)
                small=arr[i];
        }
        System.out.println("Smallest elements present in given array :"+small);

    }

}
