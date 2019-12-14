import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;

public class binaryToDec {
    public static void main(String[] args) {
        System.out.print("Give a binary number: ");
        Scanner in = new Scanner(System.in);

        String binaryNumber = in.nextLine();

        int length = binaryNumber.length();


        double base = 2;
        double exponent = 0;
        int sum = 0;

        for(int i = length; i>0; i--){
            int digit = Character.getNumericValue(binaryNumber.charAt(i-1));
            sum += (int) (digit * pow(base,exponent));
            exponent++;
        }

        System.out.println("In decimal number system "+binaryNumber+" is "+sum);



    }

}