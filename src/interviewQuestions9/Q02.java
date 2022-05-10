package interviewQuestions9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q02 {
    // create a map of zipcodes and Cities, at least 3 entries
    // get the keySet and iterate over it, print the map like below:
    // zipcode1 => city1
    // zipcode2 => city2
    // part 2: print all the keys of the map
    public static void main(String[] args) {
        Map<Integer, String> sehirler = new HashMap<>();
        sehirler.put(3648, "Antalya");
        sehirler.put(3136, "Ankara");
        sehirler.put(560, "Bursa");

        for (Map.Entry<Integer,String>each:sehirler.entrySet()) {
            System.out.println(each.getKey()+" => "+each.getValue());

        }


    }

}

