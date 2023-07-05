// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на
// позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка.

package task04;

import java.util.LinkedList;
import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter stroka");
        String userString = sc.nextLine();
        System.out.println(splUsText(userString, sc));
        sc.close();
    }

    private static LinkedList<String> splUsText(String str, Scanner scan) {
        LinkedList<String> res = new LinkedList<String>();
        while (!str.equals("exit")) {
            String[] tempAr = str.split("~");
            int num = Integer.parseInt(tempAr[1]);
            if (num > res.size())
                System.out.println("no exist position");
            else if (tempAr[0].equals("print")) {
                System.out.println(res.get(num));
                res.remove(num);

            } else res.add(num, tempAr[0]);
            System.out.println("enter another one");
            str = scan.nextLine();
            
        }
    return res;
    }
}
