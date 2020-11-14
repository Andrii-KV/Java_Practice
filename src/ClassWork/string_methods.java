package ClassWork;

public class string_methods {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.replace('l','_');
        if (str1.contains("ll")){
            System.out.println("we have \"ll\"");
        }

        System.out.println(str1);
        System.out.println(str2);
    }
}
