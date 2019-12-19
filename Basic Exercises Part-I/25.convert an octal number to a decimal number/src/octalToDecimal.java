import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Math.pow;

public class octalToDecimal {

    public static void main(String[] args) {

        System.out.print("Give a octal number: ");
        Scanner in = new Scanner(System.in);

        String octalNumber = in.nextLine();

        int length = octalNumber.length();
        List<Integer> octal = new ArrayList<Integer>();

        for(int j = 0; j < octalNumber.length(); j++){
            int digit = Character.getNumericValue(octalNumber.charAt(j));
            octal.add(digit);
        }

        int sum = 0;
        int getOctalIndex = length;
        int exponent=0;

        for(int i=length; i>0;i--){
            sum += (int) (octal.get(getOctalIndex-1) * pow(8,exponent));
            exponent++;
            getOctalIndex--;
        }
        System.out.println("Decimal result: "+sum);


    }


}
