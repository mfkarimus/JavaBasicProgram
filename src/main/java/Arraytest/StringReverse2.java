package Arraytest;

public class StringReverse2 {
    public static void main(String[] args) {
        String reverse="";
        String originalString ="MADAM";
        int length = originalString.length();
        //System.out.println(originalString.length());

        for(int i = length-1; i>=0; i--){
            reverse = reverse + originalString.charAt(i);
        }
        System.out.println(reverse);

        if (originalString.equals(reverse))
            System.out.println("This is a palindrome");

        else
            System.out.println("This is not a palindrome");
    }
}
