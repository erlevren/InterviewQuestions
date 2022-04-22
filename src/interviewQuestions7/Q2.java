package interviewQuestions7;

import java.util.Scanner;

public class Q2 {
    // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
    // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz = ");
        int sekil = scan.nextInt();
        String yaz = "";

        for (int i = 0; i < sekil; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("^");
            }
            System.out.println();
        }
        for (int i = 1; i < sekil; i++) {
            System.out.println("|||");

        }
    }
}
