package interviewQuestions9;

import java.util.HashMap;
import java.util.Map;

public class Q03 {
    //aşağıdaki çıktıyı elde ediniz
    // Kiraz 100
    // İncir 200
    // Enginar 150
    // Üzüm 145
    // Nar 250
    public static void main(String[] args) {
        Map<String,Integer> meyveler = new HashMap<>();
        meyveler.put("Kiraz",100);
        meyveler.put("Incir",200);
        meyveler.put("Enginar",150);
        meyveler.put("Uzum",145);
        meyveler.put("Nar",250);

        for (Map.Entry<String,Integer> w:meyveler.entrySet()) {
            System.out.println(w.getKey()+" "+w.getValue());

        }

    }
}
