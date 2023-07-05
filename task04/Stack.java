// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop(). 

package task04;

public class Stack {
    int[] array;
    int top;

    public Stack(int size) {
        array = new int[size];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean empty() {
        return top == -1;
    }

    public void push(int num) {
        array[++top] = num;
    }

    public int peek() {
        if (empty()) throw new IllegalStateException ("стек пустой");
        return array[top];
    }

    public int pop() {
        if (empty()) throw new IllegalStateException ("стек пустой");
        return array[top--];
    }

    public static void main(String[] args) {
        Stack st=new Stack(100);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        System.out.println("Size"+st.size());
        System.out.println("POP"+st.pop());
        
    }
}
