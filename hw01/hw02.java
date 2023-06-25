package hw01;

import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class hw02 {
    public static void main(String[] args) {
        // 2) Вывести все простые числа от 1 до 1000
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number until we will search simple numbers:   ");
        Integer numb = scanner.nextInt();
        //ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < (numb+1); i++) {
            if (SimpleN(i) == true) System.out.print(i+" ");;
        }
    }
    private static Boolean SimpleN (Integer number) {
        Boolean Result = true;
        if (number == 1 | number == 2 | number ==3) {
            return Result;
        }
        if (number % 2==0) {
            Result = false;
            return Result;
        }
        for (int i = 3; i < number; i += 2) {
            if (number % i == 0) {
                Result = false;
                return Result;
            }
        }
        return Result;
    }
}