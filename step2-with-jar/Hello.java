import depjar1.Lib1;
import depjar2.Lib2;

public class Hello {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(Lib1.calc(a, b));
        System.out.println(Lib2.calc(a, b));
    }
}
