import java.lang.ref.SoftReference;

public class Person {
    Pet pet;

    Person person;

    String name;
    int age;

    char sex;










    String getName(){
        if (sex == 'M'){
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }

    void setName(String name){

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
