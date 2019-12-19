import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class decToOctal {

    public static void main(String[] args) {

        System.out.print("Give a decimal number: ");
        Scanner in = new Scanner(System.in);

        float decNumber = in.nextInt();

        List<Integer> reminded = new ArrayList<Integer>();

        while((int)decNumber>0){
            decNumber = decNumber / 8;
            int intNumber = (int) decNumber;
            float reminder = ((decNumber - intNumber)*8);

            reminded.add((int) reminder);

        }

        System.out.print("In base of 8 it is: ");
        for(int i = reminded.size();i > 0; i--){

            System.out.print(reminded.get(i-1));
        }





    }


}
