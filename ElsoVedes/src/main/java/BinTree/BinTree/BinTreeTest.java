package BinTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BinTreeTest {

    static boolean isComment = false;
    static BinTree binTree = new BinTree();
    static final int bitmask = 128;
    static Pattern pattern = new Pattern("010101");
    static String current = "";

    static void giveElement(int readChar) {

        for (int i = 0; i < 8; ++i) {
            if ((readChar & bitmask) == bitmask) {
                binTree.addElement('1');
                current += "1";
            } else {
                binTree.addElement('0');
                current += "0";
            }
            readChar <<= 1;

            if (pattern.getPatternLength() == i - 1) {
                pattern.checkPattern(current);
                current = "";
            }
        }
    }

    public static void printOut(String outputFileName) throws IOException {

        BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName));
        //	binTree.writeOut(output, binTree.getRoot());

        output.write("\nData:\n");
        output.write("depth = " + binTree.getDeep() + "\n");
        output.write("mean = " + String.format("%.4f", binTree.getAverage()) + "\n");
        output.write("var = " + String.format("%.5f", binTree.getDeviation()) + "\n");

        output.close();
    }

    public static boolean reading(char readChar) { // Érvényes karaktert olvastunk-e?

        // Ha sign == false, akkor a karakter rendben, de ha a sign == true, akkor continue-zni kéne..
        boolean sign = false; // continue kiváltása
        if (readChar == '>') {
            isComment = true;
            sign = true;
        }
        if (readChar == '\n') {
            isComment = false;
            sign = true;
        }
        if (isComment || (readChar == 'N')) {
            sign = true;
        }

        return sign;

    }

    public static void start(String inputFileName) {

        char readChar = '0';
        int readInt = 0;
        boolean validCharacter = false;

        try {

            BufferedReader input = new BufferedReader(new FileReader(inputFileName));

            while ((readInt = input.read()) != -1) {
                readChar = (char) readInt;

                validCharacter = reading(readChar); // Ha false-t add vissza, akkor rendben, nem kellett continue-zni az eredeti kódban
                if (validCharacter == false) {
                    giveElement(readInt);
                } // if end
            } // while loop end
            input.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("java BinTree inputFileName outputFileName");
            return;
        }

        try {

            start(args[0]);
            printOut(args[1]);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println(pattern.getPatternsNumber());

    }
}
