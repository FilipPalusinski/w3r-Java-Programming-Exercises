import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecToHex {

    public static void main(String[] args) {

        System.out.print("Give a decimal number: ");
        Scanner in = new Scanner(System.in);

        float decNumber = in.nextInt();
        String Hex[][] = {{"10","11","12","13","14","15"}, {"A","B","C","D","E","F"}};
        List<Integer> reminded = new ArrayList<Integer>();

        while((int)decNumber>0){
           decNumber = decNumber / 16;
           int intNumber = (int) decNumber;
           float reminder = ((decNumber - intNumber)*16);

           reminded.add((int) reminder);

        }

        System.out.print("In base of 16 it is: ");
        for(int i = reminded.size();i > 0; i--){
            if(reminded.get(i-1) > 9){
                for(int j = 0 ; j<6;j++){
                    if(reminded.get(i-1) == Integer.parseInt(Hex[0][j])){
                        System.out.print(Hex[1][j]);
                    }
                }
            }else{
                System.out.print(reminded.get(i-1));
            }





        }





    }


}
