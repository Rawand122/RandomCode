public class ThreadExample extends Thread {
    //Class to experiment with threads in java

    private String name;
    private int number;

    public ThreadExample(String name, int threadNumber) {
        this.name = name;
        this.number = threadNumber;
    }

    public void run() {

        System.out.println("Thread running" + this.number);
        Processor.CSVReaderScanner(this.name);
        System.out.println(this.number + " has finished executing");

    }


}
