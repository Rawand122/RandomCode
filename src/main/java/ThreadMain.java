public class ThreadMain {
    private static String smallFile = "file/DataSmall.csv";

    public static void main(String[] args) throws InterruptedException {

        /*
         * class to call CSV processors using threads
         * */

        long startTime = System.currentTimeMillis();
        ;
        ThreadExample myThread = new ThreadExample(smallFile, 1);
        ThreadExample myThread1 = new ThreadExample(smallFile, 2);
        ThreadExample myThread2 = new ThreadExample(smallFile, 3);
        myThread.start();
        myThread1.start();
        myThread2.start();
        myThread.join();
        myThread1.join();
        myThread2.join();
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println(totalTime);
    }
}
