package interviewQuestions7;

import java.util.Arrays;

public class Q06 {
    // Create a method which takes String array as a parameter
    // and prints all the element
    public static void main(String[] args) {
        String[] arabalar = {"Honda", "Toyota", "Porsche", "Tesla", "BMW"};
        String [] eleman = elemanYazdir(arabalar);
        System.out.println(Arrays.toString(eleman));
        String[] renkler = {"Mavi", "Kirmizi", "Mor", "Kahverengi", "Sari", "Turuncu", "Yesil"};
        String[] elemanRenk = elemanYazdir(renkler);
        System.out.println(Arrays.toString(elemanRenk));
    }
    private static String [] elemanYazdir(String[] arr) {
        //System.out.println(Arrays.toString(arr));
        return arr;
    }
}
