package HomeWork;

public class HW_6 {
    public static void main(String[] args) {
        var m = new HW_6();
        int[] sum = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int[] max =  {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int[] min = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int[] avg = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] sumx2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int[][] maxx2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println(m.sum(sum));
        System.out.println(m.max(max));
        System.out.println(m.max2(max));
        System.out.println(m.min(min));
        System.out.println(m.average(avg));
        System.out.println(m.sumx2(sumx2));
        System.out.println(m.maxx2(maxx2));

    }
    public int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }


    public int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public int max2(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }


    public int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            min = Math.min(arr[i], min);
        }
        return min;
    }


    public int average(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }


    public int sumx2(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }


    public int maxx2(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }
        return max;
    }


}
