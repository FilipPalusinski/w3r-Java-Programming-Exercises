import java.util.Scanner;

public class addTwoBinary {

    public static void main(String[] args) {
        String firstBinary, secondBinary;

        int[] summary;
        Scanner in = new Scanner(System.in);

        System.out.print("Type first binary number: ");
        firstBinary = in.nextLine();

        System.out.print("Type second binary number: ");
        secondBinary = in.nextLine();

        System.out.println("Sum of two binary numbers: "+addnumbers(firstBinary, secondBinary));


    }
    public static String addnumbers(String first, String second){
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }

}
