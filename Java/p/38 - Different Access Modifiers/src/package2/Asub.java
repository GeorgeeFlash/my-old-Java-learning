package package2;
import package1.A;

public class Asub  {
    public static void main(String[] args) {

        C c = new C();
        A a = new A();
        System.out.println(c.defaultMessage);
        System.out.println(a.protectedMessage);

        

    }

}