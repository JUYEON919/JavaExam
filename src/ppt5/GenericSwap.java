package ppt5;

import java.util.Arrays;

public class GenericSwap {
    public static <T> void swap(T[] array, int index1, int index2) {

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // 정수 배열 예제
        Integer[] intArray = {1,2,3,4,5,6,7};
        System.out.println("정수 배열 교환 전: " + Arrays.toString(intArray));
        swap(intArray, 2, 5);//첫번째랑 네번째교환
        System.out.println("정수 배열 교환 후: " + Arrays.toString(intArray));

        // 문자열 배열 예제
        String[] strArray = {"A", "B", "C", "D", "E"};
        System.out.println("문자열 배열 교환 전: " + Arrays.toString(strArray));
        swap(strArray, 0, 4);
        System.out.println("문자열 배열 교환 후: " + Arrays.toString(strArray));
    }
}

