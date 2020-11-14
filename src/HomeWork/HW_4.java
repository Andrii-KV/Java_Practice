package HomeWork;

public class HW_4 {
    public static void main(String[] args) {
        System.out.println(task1());
        System.out.println(task2());
        System.out.println(task3_1());
        System.out.println(task3_2());



    }

    public static String task1(){
        for (int i = 0; i <= 15; i++){
            System.out.print(i + " ");
        }
        return "Done!";
    }

    public static String task2(){

        

        double result = 0;
        for (int i = 1; result < 10000; i++){
            result = Math.pow(5, i);
            if (result < 10000)
            System.out.print(result + " ");

        }
        return "Done!";
    }

    public static String task3_1(){
        int result = 0;
        for (int i = 40; i <= 60; i++) {
            result = i;
            if (i % 2 == 0 ) {
                System.out.print(i + " ");
            }
        }
        return "Done!";
    }

    public static String task3_2(){
        for (int i = 40; i <= 60; i+= 2) {
            System.out.print(i + " ");


        }
        return "Done!";
    }
}

