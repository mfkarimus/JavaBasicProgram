package Arraytest;

public class ReverseNumberDemo {
    public static void main(String[] args) {
        int rev=0, temp;
        int originalnumber=454; //It is the number variable to be checked for reverse

        temp=originalnumber;
        while (originalnumber>0){
            rev=(rev%10)+(originalnumber%10);
            originalnumber=originalnumber/10;
        }
        System.out.println(rev);

        if(temp==rev)
            System.out.println("palindrome number");

        else
            System.out.println("not palindrome");
    }
}
