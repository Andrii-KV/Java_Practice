package HomeWork;

public class HW_5 {
    public static void main(String[] args) {
        var e = new HW_5();
        //System.out.println(e.ex1("Перестановочный алгоритм быстрого действия", 'о' ));
        //System.out.println(e.ex2("Перевыборы выбранного президента", 'е'));
        System.out.println(e.ex3("Посмотрите как Рите нравится ритм", "рит"));

    }
    public String ex1 (String str, char l){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == l) {
                result += str.charAt(i);
            }
        }
        return result;
    }


    public int ex2 (String str, char l){
      int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == l) {
                count ++;
            }
        }
        return count;
    }


    public String ex3 (String str, String s){
        str = str.toLowerCase();
        String index = "";
        for (int i = 0; i < str.length(); i++) {

            if (i == str.indexOf(s, i ) ) {

                index += str.indexOf(s, i ) + ", ";

            }
        }
        return index.substring(0,index.length()-2);
    }

}
