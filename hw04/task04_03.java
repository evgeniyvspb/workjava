package hw04;

import java.util.Scanner;
import java.util.Stack;

// 3) В калькулятор добавьте возможность отменить последнюю операцию.

public class task04_03 {
//    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int doing = 0;
        float finalMeaning = 0;
        Stack<String> stack = new Stack<String>();
        PersonCortege newCort = new PersonCortege(null, stack);
        Scanner scanner = new Scanner(System.in);
        while ((doing != 3)) {
            System.out.println("Чем планируем заняться:   ");
            System.out.println("1 - считать 2 - откатить операцию 3 - закончить работу");
            doing = scanner.nextInt();
            if (doing == 2) {
                stack.pop();
                stack.pop();
                stack.pop();
                finalMeaning = Float.valueOf(stack.lastElement());
                System.out.println(finalMeaning);
            } else if (doing == 1) {
                newCort = calc(finalMeaning, stack);
                finalMeaning = newCort.finalResult;
            }
        }
    scanner.close();
    }
    
    public static PersonCortege calc(float finalMeaning, Stack<String> stack) {
        PersonCortege newCor= new PersonCortege(null, stack);
        Scanner scanner = new Scanner(System.in);
        float numb1=finalMeaning;
        if (stack.isEmpty()) {
            System.out.println("Введите первое число:   ");
            String temp = scanner.nextLine();
            numb1 = Float.valueOf(temp);
            stack.add(temp);            
        }
        System.out.println("Какая будет производится ОПЕРАЦИЯ:   ");
        String operMainString = scanner.nextLine();
        stack.add(operMainString);
        System.out.println("Введите второе число:   ");
        Float numb2 = scanner.nextFloat();
        stack.add(numb2.toString());
        //sc.close();
        switch (operMainString) {
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
        System.out.println("Результат вычислений:  "+numb1+operMainString+numb2+"="+finalMeaning);
        stack.add(String.valueOf(finalMeaning));
        newCor.finalResult=finalMeaning;
        newCor.stack=stack;
        //scanner.close();
        return newCor; 
    }
}