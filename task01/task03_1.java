package task01;

public class task03_1 {
    public static void main(String[] args) {
        task03_1 task = new task03_1();
        task.go();
    }

    private void go() {
        int[] array = new int[] { 3, 3, 2, 3, 4 };
        int val = 3;
        int lastItem = array.length - 1;
        for (int i = lastItem; i >= 0; i--) {
            if (array[i] == val)
                swap(array, i, lastItem--);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private int[] swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return arr;
    }
}
