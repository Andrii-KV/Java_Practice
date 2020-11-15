package HomeWork;

public class Salary {

    static int getSum(Employee[] employees){
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
           sum += employees[i].getSalary();
        }
        return sum;
    }
}
