package interviewQuestions9;

import java.util.HashMap;

public class Q05_PrintMap {
    /*
        Hashmap ile 1 den 6 ya kadar sayilari sayi ve okunusu seklinde yazdirin
    */

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Bir");
        map.put(2, "Iki");
        map.put(3, "Uc");
        map.put(4, "Dort");
        map.put(5, "Bes");
        map.put(6, "Alti");
        System.out.println("map = " + map);
        //map = {1=Bir, 2=Iki, 3=Uc, 4=Dort, 5=Bes, 6=Alti}
    }
}
