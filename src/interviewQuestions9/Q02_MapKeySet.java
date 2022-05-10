package interviewQuestions9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q02_MapKeySet {
    // create a map of zipcodes and Cities, at least 3 entries
    // get the keySet and iterate over it, print the map like below:
    // zipcode1 => city1
    // zipcode2 => city2
    // part 2: print all the keys of the map

    public static void main(String[] args) {

        Map<Integer,String> zipcodeAndCities = new HashMap<>();
        zipcodeAndCities.put(85001, "Arizona");
        zipcodeAndCities.put(71601, "Arkansas");
        zipcodeAndCities.put(80001, "Colorado");

        Set<Integer> keys = zipcodeAndCities.keySet();
        //Not :get(key); istenen key degeri Map’de varsa o key’e ait value’yu doner , map’de yoksa null doner.

        for (Integer key: keys
             ) {
            System.out.println(key + "=>" + zipcodeAndCities.get(key));
        }
        /*
        71601=>Arkansas
        80001=>Colorado
        85001=>Arizona
         */

        System.out.println(keys); //[71601, 80001, 85001]
    }
}
