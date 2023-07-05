// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
// “перевернутый” список.

package hw04;
import java.util.LinkedList;
public class dz04_01 {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<>();
        LinkedList<String> arr_new = new LinkedList<>();
        arr.add(0, "dgkhk");
        arr.add(0,"sdfef");
        arr.add(0, "dgkhk");
        arr.add(0, "3r");
        System.out.println(arr);
        arr_new=reversListatLast(arr);
        System.out.println(arr_new);
    }
    private static LinkedList<String> reversListatLast(LinkedList<String> linlLst) {
        LinkedList<String> ar = new LinkedList<String>();
        for (int i = 0; i < linlLst.size(); i++){
            ar.add(0,linlLst.get(i));
        }
        return ar;
    }

}
