package interviewQuestions7;

import java.util.Random;

public class Q04_CreateMethodWithArray {

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
        Random rand = new Random();
        int [] sayilar =new int[5];

        for (int i = 0; i < sayilar.length;i++){
            sayilar[i] = rand.nextInt(10); //array in elemanlarina 0 -10 arasi sayi atamasi yapar
        }

        printArray(sayilar);
        printSum(sayilar);
        printMaxValue(sayilar);
    }

    public static void printMaxValue(int[] sayilar) {
        int maxDeger = sayilar[0];
        for (int i = 1; i < sayilar.length; i++){
            maxDeger = Math.max(sayilar[i],maxDeger);
        }
        System.out.println("maxDeger = " + maxDeger);
    }

    public static void printSum(int[] sayilar) {
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++)
            toplam +=sayilar[i];
        System.out.println("toplam = " + toplam);
    }

    public static void printArray(int[] sayilar) {
        for (int i =0; i<sayilar.length;i++){
            System.out.print(sayilar[i] + " ");
        }
        System.out.println();
    }
}
