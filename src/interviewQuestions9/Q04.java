package interviewQuestions9;

import java.util.HashMap;
import java.util.Map;

public class Q04 {
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
         Map<Integer,String> a = new HashMap<>();
         a.put(10,"Java");
         a.put(20,"PHP");
         a.put(2,"Python");
         a.put(57,"C++");
         a.put(89,"C#");
         a.put(40,"Javascript");

         for (Map.Entry<Integer,String>w:a.entrySet()) {
             System.out.println(w.getKey()+", "+w.getValue());
         }

     }

}
