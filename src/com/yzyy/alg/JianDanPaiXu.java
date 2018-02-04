package com.yzyy.alg;

/**
 * 简单排序
 * Created by Administrator on 2018/2/3 0003.
 */
public class JianDanPaiXu {

    /**
     * 冒泡排序
     * @param arr
     */
    public static void maoPaoSort(int arr[]) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i -1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int t = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = t;
//                }
//            }
//        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    /**
     * 选择排序
     * @param arr
     */
    public static void xuanZeSort(int arr[]) {
        int k = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            k = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
    }

    /**
     * 直接插排
     * @param arr
     */
    public static void zhiJieChaRuSort(int arr[]) {

        int target;
        //假定第一个元素被放到了正确的位置上
        //这样，仅需遍历1 - n-1
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            target = arr[i];
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = target;
        }
    }
}
