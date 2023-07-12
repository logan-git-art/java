package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrString {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
//primitive based tech
//        int[] arr = new int[5];
//
//        arr[0]= 45;
//        arr[1]= 565;
//        arr[2]= 23;
//        arr[3]= 95;
//        arr[4]= 99;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//array of object
            String[] str = new String[5];

            for (int j = 0; j < str.length; j++) {

                str[j] = in.next();

            }
            System.out.println(Arrays.toString(str));

            str[2]= "loves";

        System.out.println(Arrays.toString(str));

    }
    }
//}
