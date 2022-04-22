package interviewQuestions7;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz : ");
        String str = scan.nextLine().toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != 'a'&& str.charAt(i) != ' ')
            System.out.println(str.charAt(i));
        }
    }
}
