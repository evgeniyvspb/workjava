// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package hw02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;

public class hw02_02 {
    public static void main(String[] args) {
        int [] mas = {11, 3, 14, 16, 7,34,7,86,25,87,33};
        sorting(mas);
        System.out.println(Arrays.toString(mas));
    }

    static void record(String rez) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("logo_calc.txt", false))) {
            writer.write(rez + '\n');

        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
    }

    static int[] sorting(int[] mas){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
                    record(Arrays.toString(mas));
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        return mas;

    }
}
