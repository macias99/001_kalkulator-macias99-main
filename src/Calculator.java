import java.io.*;
import java.util.Scanner;

public class Calculator {
    private int state = 0;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void add(int value) {
        state += value;
        save();
    }

    public void mult(int value) {
        state *= value;
        save();
    }

    public void divide(int value){
        if (value!=0){
            state /= value;
        }
        save();
    }
    public void sub(int value){
        state -= value;
        save();
    }
    private void save(){


        PrintWriter printWriter= null;
        try {
            printWriter = new PrintWriter("wyniki.txt");
            printWriter.println(state);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
    public int read() throws FileNotFoundException {
        File file =new File("wyniki.txt");
        Scanner scanner=new Scanner(file);
        return scanner.nextInt();
    }
}
