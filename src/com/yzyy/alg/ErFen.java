package com.yzyy.alg;

/**
 * 二分法查找
 * Created by Administrator on 2018/2/3 0003.
 */
public class ErFen {
    private static  int[] arry = new int[]{1, 3, 10, 15, 60, 88, 90, 100, 110};
    private static int counts = arry.length;

    public static int erFenSearch(int val) {
        int low = 0;
        int high = counts;
        while (true) {
            int mid = (low + high) / 2;
            if (val > arry[counts - 1]) {
                return -1;
            } else if (val == arry[mid]) {
                return mid;
            } else if (val < arry[mid]) {
                high = mid - 1;
            } else if (val > arry[mid]) {
                low = mid + 1;
            }
        }
    }

    public static void paixu(int[] arr){
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = arr.length - 1; j > i ; j--) {
//                if (arr[j] < arr[j - 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                }
//            }
//        }
//        int k = 0;
//        int temp = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            k = i;
//            for (int j = i; j < arr.length; j++) {
//                if (arr[j] < arr[k] ) {
//                    k = j;
//                }
//            }
//            temp = arr[i];
//            arr[i] = arr[k];
//            arr[k] = temp;
//        }

//        int temp = 0;
//        for (int i = 1; i < arr.length; i++) {
//            int j = i;
//            temp = arr[i];
//            while (j > 0 && temp < arr[j - 1]) {
//                arr[j] = arr[j - 1];
//                j --;
//            }
//            arr[j] = temp;
//        }
    }

    public static void main(String[] args) {
        int num = erFenSearch(110);
        System.out.println(num);
        System.out.println(arry[num]);
    }
}
