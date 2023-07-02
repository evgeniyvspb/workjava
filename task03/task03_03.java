// Задание №3
// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task03_03 {
    public static void main(String[] args) {
        //Arrays.asList("1", "2", "test") не получилось так как создался неизменяемый массив
        List <String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("test");
        list1.add("3");
        list1.add("repeat");

        removeDigit(list1);
        System.out.println(list1);
    }

      private static void removeDigit(List<String> dataList){
        for (int i = 0; i < dataList.size(); i++) {
            if (parsString(dataList.get(i))){   // if (Object)dataList.get(index) instanceof Integer
                dataList.remove(i);
                i--;
            }
        }
    }

    private static boolean parsString(String str){
        try{
            Integer.parseInt(str);
            return true;
        }
        catch(Exception exception) {
            return false;
        }
    }
}
