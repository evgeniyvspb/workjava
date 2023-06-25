package task01;

public class task02 {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,1,0,0,1,1,0,1,1,1,1,0,1,1};
        int count = 0;
        int maxCount=0;
        for (int i = 0; i<array.length;i++) {
            if (array[i]==1){
                count++;
            } else {
                if (maxCount<count) maxCount=count;
                count=0;
            }
        }
        if (maxCount<count) maxCount=count;
        System.out.println(maxCount);

        for (int i : array) {
            if (i==1) count++;
            else if (maxCount<count) {
                maxCount=count;
                count=0;
            }
        }
        if (maxCount<count) maxCount=count;
        System.out.println(maxCount);

        // static int getMax(int[] array) {
            
        
    
    
    
    }
}
