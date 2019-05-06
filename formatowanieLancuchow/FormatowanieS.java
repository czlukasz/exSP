package czarnotalukasz.formatowanieLancuchow;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FormatowanieS {
    public static void formatujPlik() throws Exception {
        Scanner scan = new Scanner(new File("test.csv"));
        while(scan.hasNext()) {
            String[] splittedLine = scan.nextLine().split(",");
            Object[] currentLine = {
                    splittedLine[0],
                    Float.valueOf(splittedLine[1]),
                    splittedLine[2]
            };
            System.out.format("| %-8s | %-7.2f | %-14s |\n", currentLine);
        }
    }

    public static void zapiszPlik() throws Exception {
        FileWriter wr = new FileWriter(new File("jedenGB.txt"));
        for (int i = 0; i < 250000000; i++) {
            try {
                wr.write("" + i + '\n');
            } finally {
                wr.close();
            }
        }
    }
    public static void main(String[] args) throws Exception{
        formatujPlik();
        zapiszPlik();
    }
}
