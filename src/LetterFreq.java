/**
 * Created by dmnguyen on 10/17/17.
 */
public class LetterFreq {
    final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
    double[] engFrequency = { 0.1251, 0.0925, 0.0804, 0.0760, 0.0726, 0.0709, 0.0654, 0.0612, 0.0549, 0.0414, 0.0399,
            0.0306, 0.0271, 0.0253, 0.0230, 0.0200, 0.0196, 0.0192, 0.0173, 0.0154, 0.0099, 0.0067, 0.0019, 0.0016,
            0.0011, 0.0009};
    int[] letterFreq = new int[25];
    String cipherText;

    public LetterFreq(String cipherText) {
        this.cipherText = cipherText;
        frequency();
        cipherToPlain(cipherText);

    }

    public void firstLetter() {

    }

    public void secondLetter() {

    }

    public void thirdLetter() {

    }

    public void lastLetter() {

    }

    public void followE() {

    }

    public void frequency() {
        for(int i = 0; i < cipherText.length();i++) {
            if(cipherText.charAt(i) == ' ') {
                continue;
            }
            char cipherChar = cipherText.charAt(i);
            int charPosition = ALPHA.indexOf(cipherChar);
            letterFreq[charPosition]++;
        }


    }

    // returns index of max
    public char findMax() {
        int maxIndex = 0;
        int max = 0;
        int current;
        for (int i = 0; i < letterFreq.length; i ++) {
            current = letterFreq[i];
            if(current > max) {
                max = current;
                maxIndex = i;
            }
        }
        return ALPHA.charAt(maxIndex);
    }

    // returns second highest letter
    public char underMax() {
        int highest = letterFreq[ALPHA.indexOf(findMax())];
        int secondHighest = 0;
        int secondHighestIndex = 0;
        int current;
        for (int i = 0; i < letterFreq.length; i ++) {
            current = letterFreq[i];
            if(current > secondHighest && current < highest) {
                secondHighest = current;
                secondHighestIndex = i;
            }
        }
        return ALPHA.charAt(secondHighestIndex);
    }

    public void printFrequency() {
//        System.out.println(cipherText);
        for(int i = 0; i < letterFreq.length;i++) {
            System.out.println(ALPHA.charAt(i) + ": " + letterFreq[i]);
        }
    }
    public void digraphCheck() {

    }

    public void trigraphCheck() {

    }

    public void doubleLetterCheck() {

    }

    public void twoLetterWordCheck() {

    }

    public void threeLetterWordCheck() {

    }

    public void fourLetterWordCheck() {

    }

    public void commonWordsCheck() {

    }

    public void cipherToPlain(String cipherText) {

    }

}
