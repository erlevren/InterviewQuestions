package interviewQuestions9;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q04_PrintMap {
    /*
    10, Java
    20, PHP
    2,  Python
    57, C++
    89, C#
    40, Javascript
    Map kullanarak yazınız
     */
    public static void main(String[] args) {
        Map<Integer,String> map =new LinkedHashMap<>();
        map.put(10,"Java");
        map.put(20,"PHP");
        map.put(2,"Python");
        map.put(57,"C++");
        map.put(89,"C#");
        map.put(40,"Javascript");

        System.out.println("map = " + map);
        //map = {10=Java, 20=PHP, 2=Python, 57=C++, 89=C#, 40=Javascript}

        System.out.println("1.yol :sadece key den giderek..");
        for (Integer each: map.keySet()
             ) {
            System.out.println(each +", " + map.get(each));
        }

        System.out.println("2.yol :Entry classindan faydalanarak ..");
        for (Map.Entry<Integer, String> entryYeni : map.entrySet()) {

            System.out.println(entryYeni.getKey() + ", " + entryYeni.getValue() );
        }

    }
}
