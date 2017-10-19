import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a string to cipher: ");
        String input = scn.nextLine();

        MonoAlpha ma = new MonoAlpha(input);
        System.out.println("Plain Text: " + input);
        String cipherText = ma.getCipherText();
        System.out.println("Cipher Text: " + cipherText);

//        System.out.println("Letter Frequency Analysis:");
//        System.out.println("W");
        LetterFreq lf = new LetterFreq(cipherText);
        lf.printFrequency();
        System.out.println("Highest index: " + lf.findMax());
        System.out.println("Second highest index: " + lf.underMax());

    }
}
