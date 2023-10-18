package homework65;
public class CharToPrint extends Thread{
    private char ch;
    public CharToPrint(char ch) {
        this.ch = ch;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(ch);
        }
    }
}
