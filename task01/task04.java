package task01;

public class task04 {
    public static void main(String[] args) {
        String[] str = { "flower", "flow", "flight" };
        System.out.println(prefix(str));
    }

    private static String prefix(String[] data) {
        String result = "";
        Character ch;
        int index = 0;
        while (true){
            if (index==data[0].charAt(index)){
                return result;
            }
            ch = data[0].charAt(index);
            for (String str : data) {
                if (index==str.length()){
                    return result;
                }
                if (ch!=str.charAt(index)){
                    return result;
                }
            }
            result+=ch;
            index++;
        }
    }
}
