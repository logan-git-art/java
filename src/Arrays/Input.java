package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[6];
        for(int n = 0; n<6 ; n++){
            arr[n] =in.nextInt();

        }

        System.out.println(Arrays.toString(arr));


    }
}
