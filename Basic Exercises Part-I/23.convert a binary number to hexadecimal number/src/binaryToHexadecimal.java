import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;

public class binaryToHexadecimal {
    public static void main(String[] args) {

        System.out.print("Give a binary number: ");
        Scanner in = new Scanner(System.in);

        String binaryNumber = in.nextLine();
        int len = binaryNumber.length();
        List<Integer> binary = new ArrayList<Integer>();

        while(len%4 != 0){
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
        String Hex[][] = {{"10","11","12","13","14","15"}, {"A","B","C","D","E","F"}};
        System.out.print("HexaDecimal value: ");
        for(int i = 0; i<len/4; i++){
            int index = 4;
            int getBinaryIndex = (i+1)*4-1;
            while(index>0){
                sum += (int) (binary.get(getBinaryIndex) * pow(base,exponent));
                exponent++;
                index--;
                getBinaryIndex--;
            }

            if(sum> 9){
                for(int d = 0 ; d<6;d++){
                    if(sum == Integer.parseInt(Hex[0][d])){
                        System.out.print(Hex[1][d]);
                    }
                }
            }else{
                System.out.print(sum);
            }
            exponent=0;
            sum=0;

        }

    }
}