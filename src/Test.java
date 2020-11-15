import HomeWork.Fighter;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test {



    public static void main(String[] args) {

        Pet pet = new Pet();
        pet.setName("bob");

        Staff a = new Staff();
        a.setName("Andrii");
        a.setAge(28);
        a.setSex('M');
        a.setSalary(1000000);

        Staff b = new Staff();
        b.setName("Anna");
        b.setAge(30);
        b.setSex('F');
        b.setPet(pet);
        b.setSalary(100000);

        b.setPerson(a);
        a.setPerson(b);




        Person[] people = {a, b};

        System.out.println(b.getPet().getName());
        PersonHelper personHelper = new PersonHelper();
        personHelper.printPerson(people);
        System.out.println(PersonHelper.getAvgAge(people));

        System.out.println(PersonHelper.DEFAULT_NAME);











    }



    }





