package task02;

public class task02_03 {
    public static void main(String[] args) {
        // Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает
        // boolean значение).
        String str="abcba";
        System.out.println(isitpalindrom(str));
 
    }
 
    public static Boolean isitpalindrom(String input) {
        input=input.toUpperCase();
        int len = input.length();
        for (int i = 0; i < len/2; i++) {
            if (input.charAt(i)!=input.charAt(len-i-1)){
                return false;
            }
            
        }
        return true;
        
    }
}