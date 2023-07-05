// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим.

package task04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task04_01 {
    public static void main(String[] args) {
        int len = 500000;
        System.out.println(getLinkedListatLast(len));
        System.out.println(getarrayListatLast(len));
    }

    private static long getarrayListatLast(int len) {
        List<Integer> ar = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++){
            //ar.add(i);
            ar.add(0,i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    private static long getLinkedListatLast(int len) {
        List<Integer> ar = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++)
            ar.add(0,i);
        long end = System.currentTimeMillis() - start;
        return end;
    }

}
