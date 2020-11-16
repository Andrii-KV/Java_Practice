import com.test.Employee;
import com.test.Person;

public class Test {



    public static void main(String[] args) {

//        com.test.Pet pet = new com.test.Pet();
//        pet.setName("bob");
//
//        Staff a = new Staff();
//        a.setName("Andrii");
//        a.setAge(28);
//        a.setSex('M');
//        a.setSalary(1000000);
//
//        Staff b = new Staff();
//        b.setName("Anna");
//        b.setAge(30);
//        b.setSex('F');
//        b.setPet(pet);
//        b.setSalary(100000);
//
//        b.setPerson(a);
//        a.setPerson(b);
//
//
//
//
//        com.test.Person[] people = {a, b};
//
//        System.out.println(b.getPet().getName());
//        PersonHelper personHelper = new PersonHelper();
//        personHelper.printPerson(people);
//        System.out.println(PersonHelper.getAvgAge(people));
//
//        System.out.println(PersonHelper.DEFAULT_NAME);


        Person person = new Person("Andrii", 28, 'M');
        System.out.println(person.getName());


        Employee employee = new Employee("Anna", 30, 'F', 10000);
        System.out.println(employee.getName());
        System.out.println(employee.getPersonName());












    }



    }





