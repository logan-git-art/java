public class Overloading {
    public static void main(String[] args) {
        fun("chetan bisht");
    }
    static void fun(int name){
        System.out.println(name);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
