package task01;

//import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        // System.out.println("hello");
        // System.out.println(LocalDateTime.now());
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("enter the name: ");
        // String name = scanner.nextLine();
        // System.out.println("hello "+name+"!");

        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name:   ");
        String name = scanner.nextLine();
        if (hour > 5 && hour < 12)
            System.out.println("Good morning  " + name);
        else if (hour >= 12 && hour < 18)
            System.out.println("Good day  " + name);
        else if (hour >= 18 && hour < 23)
            System.out.println("Good evening  " + name);
        else if (hour >= 23 || hour < 5)
            System.out.println("Good night  " + name);
        System.out.println(hour);

        scanner.close();
    }

}
