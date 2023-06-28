// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}



package hw02;

public class hw02_01 {
    public static void main(String[] args) {
        StringBuilder str1=new StringBuilder();
        str1.append("select * from students where ");
        StringBuilder str2=new StringBuilder();
        str2.append("{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}");
        System.out.println(str1+"ghbdtn");
    }
    public static String whereSQL(String str) {
        
    }
}
