package com.day2;

import java.util.Arrays;

public class SecLarNuInArr {

    static void main(String[] args) {
        int[] a = {1,2,54,8,7,9};
        Arrays.sort(a);
        System.out.println(a.toString());
        System.out.println(Arrays.toString(a));

        System.out.println(a[a.length-2]); //0
    }
}
