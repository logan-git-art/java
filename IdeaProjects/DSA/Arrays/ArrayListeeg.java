package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListeeg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   ArrayList<Integer> list = new ArrayList<>();
//        list.add(23);
//        list.add(235);
//        list.add(365);
//        list.add(3);
//        list.add(283);
//
//        System.out.println(list);
//        list.set(2,99);
//        list.remove(1);
//        System.out.println(list);
//input
     for (int i = 0; i < 5; i++) {

         list.add(in.nextInt());
        }
        System.out.println(list);
    }

}