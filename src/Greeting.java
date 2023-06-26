import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name:");
        String name = in.next();
        String text = greeting(name);
        System.out.println(text);

    }

    private static String greeting(String name) {
        String message = "Hii " +name;
        return message;
    }

}
