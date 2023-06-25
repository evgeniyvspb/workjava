package task01;

public class task03 {
    public static void main(String[] args) {
        int[] mass = new int[] {3,2,2,3};
        int search_num=3;
        int last_item = mass.length;
        for (int i = 0; i < last_item; i++) {
            if (mass[i]==search_num){
                mass[i]=mass[last_item-1];
                mass[last_item-1]=search_num;
                last_item--;
            }
        }  //does not work
        for (int item : mass) {
            System.out.print(item + "");
        }
    }
}
