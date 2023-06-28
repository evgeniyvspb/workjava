package hw02;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Scanner;


// 3) Реализовать простой калькулятор c логами

public class hw02_04 {
    //static Logger logger = Logger.getLogger(hw02_04.class.getName());
    public static void main(String[] args) {
        // try {
        //     FileHandler fileHandler=new FileHandler("logo1.txt");
        //     SimpleFormatter sFormater = new SimpleFormatter();
        //     fileHandler.setFormatter(sFormater);
        // } catch (Exception e) {
        //     logger.log(Level.WARNING, e.getMessage());
        // }
        // logger.log(Level.WARNING, "start working");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number:   ");
        Integer numb1 = scanner.nextInt();
        String record_rez = "enter the first number:   " + numb1;
        record(record_rez);
        //logger.info(record_rez);
        scanner.nextLine();
        System.out.println("enter the operation:   ");
        String operMain1String = scanner.nextLine();
        record_rez = "enter the operation:   " + operMain1String;
        record(record_rez);
        //logger.info(record_rez);
        System.out.println("enter the second number:   ");
        Integer numb2 = scanner.nextInt();
        record_rez = "enter the second number:   " + numb2;
        record(record_rez);
        //logger.info(record_rez);
        float rez = calc(operMain1String, numb1, numb2);
        System.out.println("Result is: " + rez);
        record_rez = "Result is:   " + numb2;
        record(record_rez);
        //logger.info(record_rez);
        scanner.close();
    }

    public static float calc(String operMain1String, float numb1, float numb2) {
        float finalMeaning = 0;
        switch (operMain1String) {
            case "+":
                finalMeaning = numb1 + numb2;
                break;
            case "-":
                finalMeaning = numb1 - numb2;
                break;
            case "*":
                finalMeaning = numb1 * numb2;
                break;
            case "/":
                finalMeaning = numb1 / numb2;
                break;
            default:
                System.out.println("this operation soon apear in next update");
                break;
        }
        return finalMeaning;
    }

    static void record(String rez) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("logo.txt", true))) { 
            writer.write(rez + '\n');
            //logger.log(Level.INFO,rez);
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
    }
}
