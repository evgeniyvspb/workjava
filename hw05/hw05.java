// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
package hw05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class hw05 {
    public static void main(String[] args) {
        Map<String, List<String>> phonebook = new HashMap<>();
        Integer doing = 1;
        String fio = "";
        String phone = "";
        Scanner scanner = new Scanner(System.in);
        while ((doing != 3)) {
            System.out.println("Чем планируем заняться:   ");
            System.out
                    .println("1 - добавить в справочник 2 - показать отсортированный спарвочник 3 - закончить работу");
            doing = scanner.nextInt();
            if (doing == 2) {
                sorting(phonebook);
            } else if (doing == 1) {
                System.out.print("Введите Фамилию:   ");
                scanner.nextLine();
                fio = scanner.nextLine();
                System.out.print("Введите номер телефона:   ");
                phone = scanner.nextLine();
                phonebook = addMan(phonebook, fio, phone);
            }
        }
        scanner.close();
    }

    private static Map<String, List<String>> addMan(Map<String, List<String>> sprav, String fio, String phone) {
        List<String> list1 = new ArrayList<String>();
        if (sprav.containsKey(fio)) {
            list1 = sprav.get(fio);
            list1.add(phone);
            sprav.put(fio, list1);
        } else {
            list1.add(phone);
            sprav.put(fio, list1);
        }
        return sprav;
    }

    private static void sorting(Map<String, List<String>> sortList) {
        Set<String> keys = sortList.keySet();
        Integer maxPhone = 0;
        List<String> list1 = new ArrayList<String>();
        for (String string1 : keys) {
            list1 = sortList.get(string1);
            if (list1.size() > maxPhone)
                maxPhone = list1.size();
        }
        while (maxPhone >= 1) {
            for (String string1 : keys) {
                list1 = sortList.get(string1);
                if (list1.size() >= maxPhone) {
                    for (String string2 : list1) {
                        System.out.println("ФИО: " + string1 + "   Номер телефона:  " + string2);
                    }
                }
            }
            maxPhone--;
        }
    }
}
