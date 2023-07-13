// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ// 2 - Объем ЖД// 3 - Операционная система// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package hw06;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Notebook {
    String name;
    Integer oZU;
    Integer memoryVint;
    String opSystem;
    String colorNote;
    Double price;

    public Notebook(String name, String opSystem, String colorNote, Integer oZU, Integer memoryVint, Double price) {
        this.name = name;
        this.opSystem = opSystem;
        this.colorNote = colorNote;
        this.oZU = oZU;
        this.memoryVint = memoryVint;
        this.price = price;

    }

    @Override
    public String toString() {
        String str = "Название:  " + name + ",  ОС: " + opSystem + "   Цвет: " + colorNote + ",  ОЗУ: " + oZU
                + ",  память винта: " + memoryVint +
             ",   цена: " + price;
        return str;

    }

    public static void main(String[] args) {
        Map<Integer, String> filterMap = new HashMap<Integer, String>();
        HashSet<Notebook> notebookes = new HashSet<Notebook>();
        notebookes = fullArr(notebookes);
        Integer doing = 1;
        Scanner scanner = new Scanner(System.in);
        while ((doing != 3)) {
            System.out.println("Чем планируем заняться:   ");
            System.out
                    .println("1 - добавить ноубук 2 - сортировать список ноутбуков 3 - закончить работу");
            doing = scanner.nextInt();
            if (doing == 2) {
                filterMap = filtr(filterMap);
                printFilter(filterMap, notebookes);
            } else if (doing == 1)
                notebookes = addNote(notebookes);
        }
        scanner.close();
    }

    public static HashSet<Notebook> fullArr(HashSet<Notebook> arr) {
        Notebook colorFul = new Notebook("Colorful X17 AT Intel Core i7", "windows", "Black", 16, 512, 13456.23);
        Notebook acer = new Notebook("Acer Predator Triton 300 SE PT316-51s", "windows", "Silver", 12, 256, 14962.00);
        Notebook asus = new Notebook("ASUS TUF Gaming F17 FX706HEB-HX171W", "без ОС", "White", 16, 256, 36923.0);
        Notebook lenovo = new Notebook("Lenovo IdeaPad 3 15IGL05", "без ОС", "white", 32, 1024, 38356.66);
        Notebook hp = new Notebook("HP ProBook 430 G6, 13.3 Intel Core i5", "linux", "black", 8, 256, 99999.99);
        Notebook lenovo1 = new Notebook("Lenovo IdeaPad 3 Gen 6 15.6 FHD TN/Core i3", "windows", "silver",
                32, 512, 4375.0);
        arr.add(colorFul);
        arr.add(acer);
        arr.add(asus);
        arr.add(hp);
        arr.add(lenovo);
        arr.add(lenovo1);
        return arr;
    }

    public static Map<Integer, String> filtr(Map<Integer, String> filterMap) {
        Integer filter;
        String filterMeaning = "";
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимым фильтрам:   ");
        System.out.println(
                "1 - название модели    2 - Операционная система  3 - Цвет    4 - ОЗУ    5 - Объем ЖД   6 - цена");
        filter = scanner1.nextInt();
        System.out.println("Введите минимальное значение для числовых фильтров и текст для текстовых фильтров:   ");
        scanner1.nextLine();
        filterMeaning = scanner1.nextLine().toLowerCase();
        filterMap.put(filter, filterMeaning);
        System.out.println("1 - Введисти 1, чтобы продолжить устанавливать фильтры  2 - выход");
        if (scanner1.nextInt() == 1)
            filterMap = filtr(filterMap);
        // scanner1.close();
        return filterMap;

    }

    public static HashSet<Notebook> addNote(HashSet<Notebook> arr) {
        Scanner scanner1 = new Scanner(System.in);
        Integer oZU;
        Integer memoryVint;
        String opSystem;
        String colorNote;
        String name;
        Double price;
        System.out.println("Введите название модели ноутбука:   ");
        name = scanner1.nextLine().toLowerCase();
        System.out.println("Введите название операционной системы:   ");
        // scanner1.nextLine();
        opSystem = scanner1.nextLine().toLowerCase();
        System.out.println("Введите цвет ноутбука:   ");
        colorNote = scanner1.nextLine().toLowerCase();
        System.out.println("Введите объём памяти:   ");
        oZU = scanner1.nextInt();
        System.out.println("Введите размер жёсткого диска:   ");
        memoryVint = scanner1.nextInt();
        System.out.println("Введите стоимость ноутбука:   ");
        price = scanner1.nextDouble();
        Notebook newNote = new Notebook(name, opSystem, colorNote, oZU, memoryVint, price);
        arr.add(newNote);
        System.out.println("ДОБАВЛЕН НОВЫЙ НОУТБУК:  " + newNote.toString());
        // scanner1.close();
        return arr;

    }

    public static void printFilter(Map<Integer, String> filterMap, HashSet<Notebook> notebookes) {
        String name;
        Integer oZU;
        Integer memoryVint;
        String opSystem;
        String colorNote;
        Double price;
        for (int i = 1; i < 4; i++)
            if (!filterMap.containsKey(i))
                filterMap.put(i, "");
        for (int i = 4; i < 7; i++)
            if (!filterMap.containsKey(i))
                filterMap.put(i, "0");
        for (Notebook notebook : notebookes) {
            name = notebook.name;
            oZU = notebook.oZU;
            memoryVint = notebook.memoryVint;
            opSystem = notebook.opSystem;
            colorNote = notebook.colorNote;
            price = notebook.price;
            if (name.contains(filterMap.get(1)) &&
                    opSystem.contains(filterMap.get(2)) &&
                    colorNote.contains(filterMap.get(3)) &&
                    oZU >= (Integer.parseInt(filterMap.get(4))) &&
                    memoryVint >= (Integer.parseInt(filterMap.get(5))) &&
                    price >= (Integer.parseInt(filterMap.get(6)))) {
                System.out.println(notebook.toString());
            }
        }
    }
}
