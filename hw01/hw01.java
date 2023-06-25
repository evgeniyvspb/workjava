package hw01;

import java.util.Scanner;

public class hw01 {
    public static void main(String[] args) {
        // ) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
        // чисел от 1 до n)
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:   ");
        Integer numb = scanner.nextInt();
        int summa = 0;
        int proizv = 1;
        for (int index = 1; index < (numb+1); index++) {
            summa+=index;
            proizv*=index;
        }
        System.out.println("summa chisel do N=" + numb+ " ravna " + summa);
        System.out.println("proizvedeine chisel do N=" + numb+ " ravno " + proizv);
    }
}
