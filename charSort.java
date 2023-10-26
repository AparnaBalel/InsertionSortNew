import java.util.Arrays;
import java.util.Scanner;

public class charSort {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String to sort");
        String str = scan.nextLine();
        System.out.println("Before: " + str +" ");
        System.out.print("After : ");
        String str1 = str.toLowerCase();
        char [] arr = str1.toCharArray();
        for(int i=1; i<arr.length; i++){
            char temp = arr[i];
            int j = i-1;
            while ( j>=0 && arr[j]> temp){
                arr[j + 1] = arr[j];
                j-- ;
            }
            arr[j + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
