import java.util.Scanner;

public class multiplyBinary {

    public static void main(String[] args) {

        String firstBinary, secondBinary;

        Scanner in = new Scanner(System.in);

        System.out.print("Type first binary number: ");
        firstBinary = in.nextLine();

        System.out.print("Type second binary number: ");
        secondBinary = in.nextLine();

        System.out.println("Multiply of two binary numbers: "+multiplyBinarynumbers(firstBinary, secondBinary));

    }
    public static String multiplyBinarynumbers(String first, String second){
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 * b2;
        return Integer.toBinaryString(sum);
    }
}
