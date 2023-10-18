package homework65;

public class Main {
    public static void main(String[] args) {
        CharToPrint process1 = new CharToPrint('#');
        CharToPrint process2 = new CharToPrint('*');
        process1.start();
        process2.start();
        //while (process1.isAlive() || process2.isAlive()) {}
        try {
            process1.join();
            process2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end of main");
    }
}
