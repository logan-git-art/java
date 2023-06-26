public class Shadowing {
  static int x = 59;// this will be shadowed at line 4 and line 7
    public static void main(String[] args) {
        System.out.println(x);
        int x = 23;
        System.out.println(x); //x is being shadowed
          fun();
    }
    static void fun(){
        System.out.println(x);
    }

}
