package HomeWork;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Andrii");
        e1.setAge(28);
        e1.setSex('M');
        e1.setSalary(10000);
        System.out.println(e1.getName());


        Employee e2 = new Employee();
        e2.setName("q");
        e2.setAge(28);
        e2.setSex('M');
        e2.setSalary(10000);

        Employee[] arr = {e1, e2};

        System.out.println(Salary.getSum(arr));

        System.out.println(e1.isSameName(e2));
    }

}
