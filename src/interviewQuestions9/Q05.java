package interviewQuestions9;

import java.util.HashMap;
import java.util.Map;

public class Q05 {
    /*
        Hashmap ile 1 den 6 ya kadar sayilari sayi ve okunusu seklinde yazdirin
    */
    public static void main(String[] args) {
        HashMap<Integer,String>sayilari = new HashMap<>();
        sayilari.put(1,"Bir");
        sayilari.put(2,"iki");
        sayilari.put(3,"uc");
        sayilari.put(4,"dort");
        sayilari.put(5,"Bes");
        sayilari.put(6,"Alti");
        System.out.println("sayilari = " + sayilari);

    }
}
