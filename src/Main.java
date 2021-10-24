import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
//        calculator.setState(2);
//        calculator.divide(2);
//        try {
//            System.out.println(calculator.read());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        try {
            calculator.setState(4);
            calculator.add(calculator.read());
            System.out.println(calculator.getState());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
