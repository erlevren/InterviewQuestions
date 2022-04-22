package interviewQuestions5;

import java.util.Scanner;

public class Q06_CountsOfRepeatingElement {
    /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
     */

    public static void main(String[] args) {
        int arr [] = {1,1,1,22,23,85,58,77,66,22,23,77};

        int sayac = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("aranilan sayiyi giriniz :");
        int sayi = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (sayi == arr[i]){
                sayac++;
            }
        }
        System.out.println("aranilan sayi :"+sayi + "\ntekrar sayisi da :" + sayac);
    }
}
