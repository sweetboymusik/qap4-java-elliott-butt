import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];

        Scanner scan = new Scanner(System.in);

        // get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        scan.close();

        // convert to all upper case
        word = word.toUpperCase();

        try {
            // count frequency of each letter in string
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                int index = currentChar - 'A';

                // if index out of bounds
                if (index < 0 || index >= counts.length) {
                    // if the character is a space
                    if (currentChar == ' ') {
                        throw new ArrayIndexOutOfBoundsException("'space' is an invalid character.");
                    }
                    // if the character is anything other than a space
                    else {
                        throw new ArrayIndexOutOfBoundsException(currentChar +
                                " is an invalid character.");
                    }
                }

                counts[index]++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // print out exception message
            System.out.println("Not a letter.");
            System.out.println(e.getMessage());

        }

        // print frequencies
        System.out.println();

        for (int i = 0; i < counts.length; i++)
            if (counts[i] != 0)
                System.out.println((char) (i + 'A') + ": " + counts[i]);
    }
}
