package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        for (int rows = 0; rows < arr.length ; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                arr[rows][cols] = in.nextInt();
            }
        }
        for (int rows = 0; rows < arr.length ; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                System.out.print(String.valueOf(arr[rows][cols]));

            }
            System.out.println();
        }


    }
}
