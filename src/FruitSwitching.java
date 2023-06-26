import java.util.Scanner;

public class FruitSwitching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Fruits = in.next();

        switch (Fruits) {
            case "Apple" -> System.out.println("It is a great fruit which keeps doctor away");
            case "Mango" -> System.out.println("King of all fruits");
            case "Banana" -> System.out.println("All time fruit");
            default -> System.out.println("You we entered wrong choice");
        }
    }
}
