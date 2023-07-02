// Задание №2.1
// Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков
// Задание №2.2 (если выполнено первое задание)
// Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

import java.util.ArrayList;
import java.util.Collections;

public class task03_02 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>(0);
        list1.add("Venera");
        list1.add("Yupiter");
        list1.add("Earth");
        list1.add("Yupiter");
        list1.add("Earth");

        int count = 1;

        Collections.sort(list1, null);
        String planet = list1.get(0);
        for (int i = 1; i < list1.size(); i++) {
            String n = list1.get(i);
            if (n.equals(planet)) count++;
            else {
                System.out.println(planet+" " + count);
                count=1;
                planet=n;
            }
        }
        System.out.println(planet+" " + count);

        planet=list1.get(0);
        for (int i = 0; i < list1.size();i++) {
            String currentPlanet = list1.get(i);
            if (currentPlanet.equals(planet)) {
                list1.remove(i);
            } else {
                planet=currentPlanet;
            }
        }
        System.out.println(list1);
    }
}
