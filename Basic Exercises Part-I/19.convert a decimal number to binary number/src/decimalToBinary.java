import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        System.out.print("Give a decimal number to change it by a magic to a binary number: ");
        Scanner in = new Scanner(System.in);
        int decimalNumber = in.nextInt();
        List binary = new ArrayList();
        int modulo;

        while(decimalNumber!=0){
            if(decimalNumber%2>0){
                modulo=1;
            }else{
                modulo=0;
            }
            decimalNumber=decimalNumber/2;
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