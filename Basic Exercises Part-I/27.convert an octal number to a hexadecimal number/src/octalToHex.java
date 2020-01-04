import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;

public class octalToHex {

        public static void main(String[] args){


            System.out.print("Give a octal number: ");
            Scanner in = new Scanner(System.in);

            String octalNumber = in.nextLine();

            int length = octalNumber.length();
            List<Integer> octal = new ArrayList<Integer>();

            for (int j = 0; j < octalNumber.length(); j++) {
                int digit = Character.getNumericValue(octalNumber.charAt(j));
                octal.add(digit);
            }

            int decimal = toDecimal(length, octal);

            String binaryNumber = decimaltoBinary(decimal);
            binaryToHex(binaryNumber);

        }
private static void binaryToHex(String binaryNum){
    int len = binaryNum.length();
    List<Integer> binary = new ArrayList<Integer>();

    while(len%4 != 0){
        len++;
        binary.add(0);
    }

    for(int j = 0; j < binaryNum.length(); j++){
        int digit = Character.getNumericValue(binaryNum.charAt(j));
        binary.add(digit);
    }

    double base = 2;
    double exponent = 0;
    int sum = 0;
    String Hex[][] = {{"10","11","12","13","14","15"}, {"A","B","C","D","E","F"}};
    System.out.print("In the hexadecimal system this value is: ");
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
    private static int toDecimal(int length, List<Integer> octal) {
        int sum = 0;
        int getOctalIndex = length;
        int exponent = 0;

        for (int i = length; i > 0; i--) {
            sum += (int) (octal.get(getOctalIndex - 1) * pow(8, exponent));
            exponent++;
            getOctalIndex--;
        }
        return sum;
    }

    private static String decimaltoBinary(int decimal) {
        List<Integer> binary = new ArrayList<Integer>();
        int modulo;
        String binaryResult= "";
        int decimalNumber = decimal;
        while (decimalNumber != 0) {
            if (decimalNumber % 2 > 0) {
                modulo = 1;
            } else {
                modulo = 0;
            }
            decimalNumber = decimalNumber / 2;
            binary.add(modulo);

        }
        int binaryArrayLength = binary.size();
        binaryArrayLength--;
        for(int i=binaryArrayLength;i>=0;i--){
            binaryResult = binaryResult.concat(Integer.toString(binary.get(i)));
        }
        return binaryResult;
    }

}
