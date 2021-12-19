import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.Scanner;

public class Processor {

    /*
     * class to process a CSV file in a number of different ways
     * */


    public static void CSVReaderScanner(String fileName) {
        //read file using scanner

        try {
            Scanner sc = new Scanner(new File(fileName));
            long start = System.currentTimeMillis();

            while (sc.hasNext()) {
                String lines = sc.next();
                String[] line = lines.split(",");
                //  System.out.print(line[3] + "\n");

            }
            sc.close();
            long finish = System.currentTimeMillis();
            long timeElapsed = finish - start;
            System.out.println("Time taken by Scanner reader: " + timeElapsed);
            //closes the scanner
        } catch (IOException exception) {
            System.out.println(exception);

        }
    }

    public static void CSVReaderBufferedReader(String filename) {
        // List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            long start = System.currentTimeMillis();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                // System.out.println(values[3]);
                // records.add(Arrays.asList(values));
            }
            long finish = System.currentTimeMillis();
            long timeElapsed = finish - start;
            System.out.println("Time taken by buffered reader: " + timeElapsed);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void CSVReaderOpenCSV(String filename) throws FileNotFoundException {
        // List<List<String>> records = new ArrayList<List<String>>();
        long start = System.currentTimeMillis();
        try (CSVReader csvReader = new CSVReader(new FileReader(filename));) {
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                // records.add(Arrays.asList(values));
            }
            long finish = System.currentTimeMillis();
            long timeElapsed = finish - start;
            System.out.println("Time taken by openCSV reader: " + timeElapsed);
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

    }

    public static void CSVReaderInputStream(String filename) throws IOException {
        InputStream inputstream = new FileInputStream(filename);
        long start = System.currentTimeMillis();
        int line = inputstream.read();
        while (line != -1) {
            //System.out.println(line[1]);
            line = inputstream.read();

        }
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Time taken by inputstream: " + timeElapsed);
    }
}
