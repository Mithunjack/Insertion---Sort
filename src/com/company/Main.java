package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] A = {7,6,5,2,1};
        System.out.println("Given Array");
        System.out.println(Arrays.toString(A));
        System.out.println("Simulations : ");
        int n = A.length;
        for (int i = 1; i<n;i++){
            int temp = A[i];
            ShiftRight(A,temp,i);
            System.out.println(Arrays.toString(A) + " temp = " + temp + " i = " + i );
        }
        System.out.println("After Insertion Sorting");
        System.out.println(Arrays.toString(A));
    }
    public static void  ShiftRight(int[] a,int t, int p){
        while (p>0 && t<a[p-1]){
            a[p] = a[p-1];
            p = p-1;
        }
        a[p] = t;
    }
}
