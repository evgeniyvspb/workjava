// Задание №3
// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди. 

package task04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class task04_02 {
    public static void main(String[] args) {
    int [] arrayList= {1,3,567,254,7,7989,79,5,4,56,458,85};
    printStack(arrayList);
    System.out.println();
    printQueue(arrayList);
    }

    public static void printStack (int[] arr){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()){
            System.err.print(stack.pop()+" ");
        }
    }

    public static void printQueue (int[] arr){
        Queue<Integer> que=new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            que.add(arr[i]);
        }
        
        for (Integer integer : que) System.out.print(integer+" ");
        //while (!que.isEmpty()) System.out.print(que.poll() +" ");
    }
}
