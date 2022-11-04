package java_week4_hw_sunil;

import java.util.Locale;
import java.util.Scanner;

/** Write a java program that takes the user to provide single character from the alphabet. Print Vowel of Consonant,
 * depending on the user input. If the user input is bit a letter (between a and z or A and Z), or is a string of length>1
 * print an error message. for eg: Input an alphabet : p
 * Expected output: Input letter is Consonant.
 */
public class Programme_3_FindVowelOrConsonant {
    public static void checkVowelOrConsonant(String letter){
        // Check length of the String
        // If user enters more than 1 character an error message is printed
        if (letter.length()>1){
            System.out.println("Error . Not a single character");
            // If user enters a symbol
                    } else if (!(isItALetter(letter))) {
            System.out.println("Error . Not a letter. Enter uppercase or lowercase letter");
        } else if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o")
        || letter.equals("u")){
            System.out.println("Input letter is a Vowel");
        }else {
            System.out.println("Input letter is a consonant");
        }
    }
    // This method will check is it a letter or not?
    public static boolean isItALetter(String l){
        return l .charAt(0) > 96 && l.charAt(0) < 123;
    }

    public static void main(String[] args) {
        // Scanner declaration for reading the input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character: ");
        String str = scanner.next().toLowerCase();
        // Calling static method directly
        checkVowelOrConsonant(str);
        // Closing scanner object
        scanner.close();
    }

}
