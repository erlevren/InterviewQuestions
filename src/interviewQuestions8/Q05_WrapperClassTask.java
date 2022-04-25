package interviewQuestions8;

import java.util.Scanner;

public class Q05_WrapperClassTask {
    // create a method that accepts an int
    // and returns twice of that int
    // overload this method with wrapper class: Integer
    // int kabul eden bir metot olustur
    // ve bu int'nin iki katını döndürür
    // bu yöntemi wrapper sınıfıyla overload et : Integer
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println(integerMethod(sayi1));
        System.out.println(integerMethod(sayi2));
    }
    private static int integerMethod(int sayi1) {
        return 2 * sayi1;
    }
    private static Integer integerMethod(Integer sayi2) {
        return 2 * sayi2;
    }
}
