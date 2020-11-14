import java.lang.ref.SoftReference;

public class Person {

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
}
