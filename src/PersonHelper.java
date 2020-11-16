import com.test.Person;

public class PersonHelper {


    static String DEFAULT_NAME = "Andrii";

    static void printPerson( Person[] people){
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
    }

    static  int getAvgAge(Person[] people){
        int sum = 0;
        for (int i = 0; i < people.length; i++) {
            sum += people[i].getAge();
        }
        return sum / people.length;
    }
}
