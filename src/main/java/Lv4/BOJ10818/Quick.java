package Lv4.BOJ10818;

import java.util.Arrays;

public class Quick {

    public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) return; // 배열길이 0이하는 꺼져라

        int mid = partition(arr, low, high);  // mid == partition row
        sort(arr, low, mid - 1); // low쪽정렬 재귀 호출 
        sort(arr, mid, high); //  //high쪽정렬 재귀호출
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) { //low == 0  high == length - 1
            while (arr[low] < pivot) low++;   // 피봇보다 앞에 있는 수가 피봇보다 작다면 피봇 뒤로 
            while (arr[high] > pivot) high--; // 피봇보다 뒤에 있는수가 피봇보다 크다면 앞으로
            if (low <= high) {   // 1차적으로 정렬
                swap(arr, low, high); // 오름차 완료
                low++;   // 가장 밖에 while을 정상적으로 종료시키기 위해
                high--;   // 위와 같음
            }
        }
        return low;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        int[] arr = new int[20];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
