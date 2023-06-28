package task02;

//         Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.
 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
 
public class task02_05 {

    static Logger logger = Logger.getLogger(task02_05.class.getName());
    public static void main(String[] args) {
        try {
            FileHandler fileHandler=new FileHandler("logo.txt",  0, 0, false);
            SimpleFormatter sFormater = new SimpleFormatter();
            fileHandler.setFormatter(sFormater);
        } catch (Exception e) {
            logger.log(Level.WARNING, e.getMessage());
        }
 
        String file = ".";
        String[] allFiles = getList(file);
        file = "list.txt";
        writeToFile(file, allFiles);
    }
        static String[] getList(String filename){
            File file = new File(filename);
            String[] strPath = file.list();
            return strPath;
        }
 
        static void writeToFile(String filename, String[] data){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            for (String string:data){
                writer.write(string);
                }
            } catch (Exception e) {
            System.out.println("error" + e.getMessage());
            logger.log(Level.INFO, e.getMessage());
        }
    }
}