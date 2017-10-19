import java.util.Random;

public class MonoAlpha {

    private final String ALPHA =        "abcdefghijklmnopqrstuvwxyz";
    private String CIPHER_ALPHA = "dylanbcefghijkmopqrstuvwxz";

    private String plainText;

    public MonoAlpha(String input) {
        plainText = input;
    }

    private String encrypt() {
//        CIPHER_ALPHA = randomCipher();
        System.out.println("Cipher ALPHA: " + CIPHER_ALPHA);
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for(int i = 0; i < plainText.length();i++) {
            if(plainText.charAt(i) == ' ') {
                cipherText += ' ';
                continue;
            }
            int charPosition = ALPHA.indexOf(plainText.charAt(i));
            char replaceChar = CIPHER_ALPHA.charAt(charPosition);
            cipherText += replaceChar;
        }
        return cipherText;
    }

    public String getCipherText() {
        return encrypt();
    }

    public String getCipherAlpha() {
        return CIPHER_ALPHA;
    }

    public String randomCipher() {
        Random rand = new Random();
        char a[] = CIPHER_ALPHA.toCharArray();
        for(int i = 0; i < a.length;i++) {
            int j = rand.nextInt(a.length);
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return String.valueOf(a);
    }
}
