import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val = 0;
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        // scan input
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());

        // iterate over tokens
        while (scanLine.hasNext()) {
            // check if token can be parsed to int
            try {
                // parse token to int
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
            }
        }

        // close scanners
        scan.close();
        scanLine.close();

        // print output
        System.out.println("The sum of the integers on this line is " + sum);
    }
}