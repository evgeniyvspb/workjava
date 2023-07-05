package hw04;
import java.util.ArrayList;
import java.util.List;
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент
// из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
public class LinkedList {
    List<String> array;
    int top;
    public LinkedList(int size) {
        array = new ArrayList<String>(size);
        top=0;
    }
    public void enqueue(String element) {
        // List<Integer> ar = new ArrayList<>();
        array.add(top,element);
        top++;
    }
    public String dequeue() {
        if (array.isEmpty()) throw new IllegalStateException ("список пустой");
        String temp = array.get(0);
        array.remove(0);
        top--;
        return temp;
    }

    public int size() {  // для облегчения тестирования сделал доп функцию
        return top;
    }

    public String first() {
        if (array.isEmpty()) throw new IllegalStateException ("список пустой");
        return array.get(0);
    }
    public static void main(String[] args) {
        LinkedList st=new LinkedList(10);
        st.enqueue("1");
        st.enqueue("er2");
        st.enqueue("ergj3");
        st.enqueue("4444");
        System.out.println(st.size());
        System.out.println(st.dequeue());
        System.out.println(st.first());
    }

}
