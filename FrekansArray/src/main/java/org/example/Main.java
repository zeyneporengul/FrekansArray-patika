package org.example;
import java.util.Arrays;


public class Main {

    static void frekans(int[] list){
        for(int i=0; i<list.length; i++){
            int flag = list[i];
            int repeat = 1;

            if(flag == -1){
                continue;
            }

            for (int j = i + 1; j < list.length; j++){
                if (list[i] == list[j]) {
                    repeat++;
                    list[j] = -1;
                }
            }

            System.out.println(list[i] + " sayısı " + repeat + " kez tekrar edildi.");

        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi: " + Arrays.toString(arr));
        frekans(arr);
    }
}