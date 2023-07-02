// Задание

// Реализовать алгоритм сортировки слиянием
// Пусть дан произвольный список целых чисел, удалить из него четные числа
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package hw03;

import java.util.*;

public class hw03 {
    public static void main(String[] args) {
        int[] actual = { 5, 1, 6, 2, 3, 4, 8, 12, 21, 6,5,7,22,34,35,11 };
        mergeSort(actual, actual.length);
        for (int i = 0; i < actual.length; i++) {
            System.out.print(actual[i] + " ");
        }
        System.out.println();
        List<Integer> data = new ArrayList<Integer>();
        data = removeChet(actual);
        for (int i = 0; i < data.size(); i++) {
            System.out.print(data.get(i) + " ");
        }
        System.out.println();
        int max = Collections.max(data);
        System.out.println("Maximum is : " + max);
  
        int min = Collections.min(data);
        System.out.println("Minimum is : " + min);
        System.out.println("Middle is : " + (max+min)/2);
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2)
            return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++)
            l[i] = a[i];
        for (int i = mid; i < n; i++)
            r[i - mid] = a[i];
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        }
        while (i < left)
            a[k++] = l[i++];
        while (j < right)
            a[k++] = r[j++];
    }

    private static List<Integer> removeChet(int[] dataList) {
        List<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < dataList.length; i++)
            data.add(dataList[i]); // скопировали в массив
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) % 2 == 0) { // if (Object)dataList.get(index) instanceof Integer
                data.remove(i);
                i--;
            }
        }
        return data;
    }
}
