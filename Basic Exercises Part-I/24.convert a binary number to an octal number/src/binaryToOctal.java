import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;

public class binaryToOctal {
    public static void main(String[] args) {

        System.out.print("Give a binary number: ");
        Scanner in = new Scanner(System.in);

        String binaryNumber = in.nextLine();
        int len = binaryNumber.length();
        List<Integer> binary = new ArrayList<Integer>();

        while(len%3 != 0){
            len++;
            binary.add(0);
        }

        for(int j = 0; j < binaryNumber.length(); j++){
            int digit = Character.getNumericValue(binaryNumber.charAt(j));
            binary.add(digit);
        }

        double base = 2;
        double exponent = 0;
        int sum = 0;

        System.out.print("Octal number: ");
        for(int i = 0; i<len/3; i++){

            int index = 3;
            int getBinaryIndex = (i+1)*3-1;

            while(index>0){
                sum += (int) (binary.get(getBinaryIndex) * pow(base,exponent));
                exponent++;
                index--;
                getBinaryIndex--;
            }


                System.out.print(sum);

            exponent=0;
            sum=0;

        }

    }
}