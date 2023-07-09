// Задание №3Написать метод, который переведет число из римского формата записи в арабский.Например, MMXXII = 2022
package task05;

import java.util.HashMap;
import java.util.Map;

public class task05_03 {
    public static void main(String[] args) {
        String data = "MMXXII";
        System.out.println(data + "="+arabicDig(data));
    }

    private static Map<Character, Integer> romanToArabic() {
        Map<Character, Integer> dict = new HashMap<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);
        return dict;
    }

    private static Integer arabicDig(String str) {
        int rez = 0;
        Map<Character, Integer> arDig = romanToArabic();
        for (Character iterable_element : str.toCharArray()) {
            rez += arDig.get(iterable_element);
        }
        return rez;
    }
}
