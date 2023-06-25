package hw01;

import java.util.Scanner;

public class hw03 {
    public static void main(String[] args) {
        // 3) Реализовать простой калькулятор
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number:   ");
        Integer numb1 = scanner.nextInt();
        //System.out.println("enter the operation:   ");
        String operMain = scanner.nextLine();

        System.out.println("enter the operation:   ");
        String operMain1String = scanner.nextLine();

        System.out.println("enter the second number:   ");
        Integer numb2 = scanner.nextInt();
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
            case "^":
                finalMeaning = numb1 ^ numb2;
                break;
            default:
                System.out.println("this operation soon apear in next update");
                break;
        }
        System.out.println("Result is: " + finalMeaning);
        scanner.close();    
    }
}
