package task02;

import java.io.BufferedWriter;
import java.io.FileWriter;
 
public class task02_04 {
    public static void main(String[] args) {
        // Напишите метод, который составит строку, состоящую из 100
        // повторений слова TEST и метод, который запишет эту строку в
        // простой текстовый файл, обработайте исключения.
        record(testString(100, "TEST"));
    }
 
    static String testString(int count, String string) {
        StringBuilder rezult = new StringBuilder();
        for (int i = 0; i < count; i++) {
            rezult.append(String.format("%d:%s\n", i, string));
        }
        return rezult.toString();
    }
 
    static void record(String string) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("putput.txt", false))) { //false значит перезаписывает а Тру добавлчет
            writer.write(string);
 
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
    }
 
}