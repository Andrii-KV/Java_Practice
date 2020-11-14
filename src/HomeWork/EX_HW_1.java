package HomeWork;

import java.util.Arrays;

public class EX_HW_1 {

    public static int[] arr1 (int[] arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1]){
                index = i;
                break;
            }
        }
        int[] result;
        result = new int[index];
        int j = 0;
        for (int i = index; i < arr.length - 1; i++) {
            result[j] = arr[i];
            j++;

        }
        //result[0] = index;
        return result;
    }

//    Задача №1
//    Дан массив:
//    int[] array = {4, 5, 0, 7, 8, 9, 10, 0};
//    необходимо вывести не последовательный элемент массива(который идет не по порядку).


    public static void main(String[] args) {
        var a = new EX_HW_1();
        //System.out.println(arr1(new int[] {1, 2, 6, 12, 7, 10, 1}));
        System.out.println(Arrays.toString(arr1(new int[] {1, 2, 6, 12, 7, 10, 1})));

    }



}
