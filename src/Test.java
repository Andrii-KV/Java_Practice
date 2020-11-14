import java.util.Arrays;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {

        Person a = new Person();
        a.setName("Andrii");
        a.setAge(28);
        a.setSex('M');

        Person b = new Person();
        b.setName("Anna");
        b.setAge(30);
        a.setSex('F');

        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(b.getName());
        System.out.println(b.getAge());

    }

    }





