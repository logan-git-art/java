import java.util.Scanner;

public class Function1 {

    public static void main(String[] args) {

        int ans =sum1();

        System.out.println(ans);
    }
    static int sum1(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first no.:");
        int a = in.nextInt();

        System.out.print("Enter the first no.:");
        int b = in.nextInt();

        int sum =a+b;
        return sum;

    }
}
