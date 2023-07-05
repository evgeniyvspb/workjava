package hw04;

import java.util.Stack;

// POGO для группировки нескольких полей
public class PersonCortege {
    public Float finalResult;
    public Stack<String> stack;

    public PersonCortege(Float finalResult, Stack<String> stack) {
        this.finalResult = finalResult;
        this.stack = stack;
    }
}

class Main {
    // Возвращаем несколько значений из метода в Java
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        PersonCortege person = new PersonCortege(null, null);
        person.finalResult = Float.parseFloat("12");
        stack.add(person.finalResult.toString());
        System.out.println("Name is " + person.finalResult);
        System.out.println("Age is " + person.stack);
        System.out.println(person);
    }
}