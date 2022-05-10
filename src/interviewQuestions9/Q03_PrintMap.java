package interviewQuestions9;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q03_PrintMap {
    //aşağıdaki çıktıyı elde ediniz
    // Kiraz 100
    // İncir 200
    // Enginar 150
    // Üzüm 145
    // Nar 250

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>(); //sireali olarak yazdirir
        map.put("Kiraz", 100);
        map.put("Incir", 200);
        map.put("Enginar", 150);
        map.put("Üzüm", 145);
        map.put("Nar", 250);

        System.out.println("map = " + map); //map = {Kiraz=100, Incir=200, Enginar=150, Üzüm=145, Nar=250}

        for (Map.Entry<String, Integer> entryYeni : map.entrySet()) {

            System.out.println(entryYeni.getKey() + " " + entryYeni.getValue() );
        }


    }
}
