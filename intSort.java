import java.util.Arrays;
import java.util.Random;

public class intSort {
    public static void main(String[] args) {

        Random num = new Random();
        int []  numbers = new int[5];
        for(int i=0; i<numbers.length; i++){
            numbers[i]= num.nextInt(20);
        }
        System.out.println("Array before sorting "+ Arrays.toString(numbers));

        insertionSorting(numbers);  // calling this method

    }
    private static void insertionSorting(int[] numbers) {
        for(int i=1; i<numbers.length; i++){
            int temp = numbers[i];
            int j = i-1;
            while ( j>=0 && numbers[j]> temp){
                numbers[j + 1] = numbers[j];
                j-- ;
            }
            numbers[j + 1] = temp;

        }
        System.out.println(Arrays.toString(numbers));
    }
}
