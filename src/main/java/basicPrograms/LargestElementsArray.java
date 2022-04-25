package basicPrograms;

public class LargestElementsArray {
    public static void main(String[] args) {

        //Initialize array
        int [] arr=new int[]{2,25,30,50,75,100};
        int max=arr[0];

        for (int i=0;i<arr.length;i++){

            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Largest elements present in given array :"+max);

    }
}
