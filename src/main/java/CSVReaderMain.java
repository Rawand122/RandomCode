import java.io.IOException;

public class CSVReaderMain {
    /*
     * class to call CSV processors directly
     * */

    private static String smallFile = "file/DataSmall.csv";
    // private static String largeFile = "file/DataLarge.csv";

    public static void main(String[] args) throws IOException, InterruptedException {
        long startTime = System.currentTimeMillis();
        ;
/*        Processor.CSVReaderScanner(smallFile);
        Processor.CSVReaderBufferedReader(smallFile);
        Processor.CSVReaderOpenCSV(smallFile);
        Processor.CSVReaderInputStream(smallFile);*/
        Processor.CSVReaderScanner(smallFile);
        Processor.CSVReaderScanner(smallFile);
        Processor.CSVReaderScanner(smallFile);
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println(totalTime);


    }

}
