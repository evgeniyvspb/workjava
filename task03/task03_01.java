// Даны следующие строки, cравнить их с помощью == и
// метода equals() s1.equalignoreCase (чтобы регистр хорошо) класса Object
// String s1 = "hello";
// String s2 = "hello";
// String s3 = s1;
// String s4 = "h" + "e" + "l" + "l" + "o";
// String s5 = new String("hello"); - НЕ РАВНО НО ЭКВИВАЛЕНТНО
// String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});  - - НЕ РАВНО НО ЭКВИВАЛЕНТНО

// Задание №1
// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на
// экран.

import java.util.ArrayList;
import java.util.Collections;

public class task03_01 {
    public static void main(String[] args) {
        int num = 10;
        ArrayList<Integer> newArrayList = new ArrayList<Integer>(num); //  по умолчанию итак 10. Но он итак динамический так что можно прото добавлять итак
        //for (int i = 0; i < newArrayList.size(); i++) {
        for (int i = 0; i < num; i++) {
            int number = (int)(Math.random()*100);
            newArrayList.add(number);
        }
        Collections.sort(newArrayList);
        System.out.println(newArrayList);
    }
}
