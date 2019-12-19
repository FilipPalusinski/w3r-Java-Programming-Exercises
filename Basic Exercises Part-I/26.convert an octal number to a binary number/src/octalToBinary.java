import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Math.pow;

public class octalToBinary {

    public static void main(String[] args) {

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

        toBinary(decimal);




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

    private static void toBinary(int decimal) {
        List<Integer> binary = new ArrayList<Integer>();
        int modulo;
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
        System.out.print("My magic program says that it's ");
        for(int i=binaryArrayLength;i>=0;i--){
            System.out.print(binary.get(i));
        }
        System.out.print(" in binary system");
    }



}
