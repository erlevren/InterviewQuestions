package interviewQuestions9;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q06 {
    // TreeMap kullanarak bir cümlenin içindeki harflerin frekansını method ile bulunuz.
    public static void main(String[] args) {
        String cumle = "TreeMap kullanarak bir cümlenin içindeki harflerin frekansını method ile bulunuz";
        TreeMap<String,Integer> map = new TreeMap<>();
        String harfler [] = cumle.split("");

        for (String w:harfler) {
            if (!map.containsKey(w)){
                map.put(w,1);
            }else map.put(w,map.get(w)+1);
            //Not :get(key); istenen key degeri Map’de varsa o key’e ait value’yu doner , map’de yoksa null doner.
        }
        System.out.println(map);

        for (Map.Entry<String,Integer>each:map.entrySet()) {
            System.out.print(each.getKey()+" "+each.getValue());

        }
    }
}
