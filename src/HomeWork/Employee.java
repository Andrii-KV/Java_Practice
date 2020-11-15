package HomeWork;

public class Employee extends Person {
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    boolean isSameName(Employee employee){
        return getName().equals( employee.getName());
    }
}
