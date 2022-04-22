package interviewQuestions7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Q04 {
    //    ||This Part Should be in Main Method||
    //
    //     -Create an array of size 5, assign some random values from 0 to 10
    //     -(use random class and for loop to assign values)
    //
    //
    //    ||You should create public static void methods fori loop (Parameter should be int Array for methods)||
    //
    //     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
    //     -2-Create a method that prints the sum of an array
    //     -3-Create a method that prints the max element of an array
    //
    //    P.S: Return type should be void because we are not returning anything just printing
    public static void main(String[] args) {
        int sayilar []=new int [5];
        Random rnd = new Random();
        int toplam = 0;
        int max = 0;
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]=rnd.nextInt(10);
            toplam+=sayilar[i];
            if(sayilar[i]>max){
                max=sayilar[i];
            }
        }
        System.out.println(Arrays.toString(sayilar));
        sayilarYaz(sayilar);
        System.out.println();
        System.out.println("Array`deki sayilarin toplami = "+toplam);
        System.out.println("Array`deki en buyuk eleman = "+max);
    }
    private static void sayilarYaz(int[] sayilar) {
        for (int each:sayilar) {
            System.out.print(each+" ");
        }
    }
}
