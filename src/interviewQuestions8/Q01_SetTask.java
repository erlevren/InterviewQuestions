package interviewQuestions8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Q01_SetTask {
    //  PART 1
    // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
    // and add all elements from ArrayList to Set

    // ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
    // ve tüm öğeleri ArrayList'ten Set'e ekleyin

    // PART 2
    // create a method that takes Set<Character> and varargs of char as parameters
    // and adds all chars to the set

    // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
    // ve tüm karakterleri sete ekleyin
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(30);
        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(50);
        System.out.println("arrlist = " + arrlist); //arrlist = [10, 20, 30, 10, 20, 50]
        Set<Integer> set = new HashSet<>();
        System.out.println("set = " + set);
        arrayListdenSeteDonustur(arrlist,set);
        System.out.println("ArrayListi sete attiktan sonra = " + set);//set = [50, 20, 10, 30]

        //Part 2 :
        Set<Character>characterSet=new HashSet<>();
        karakterleriSeteEkle(characterSet,'A','B','R','r','q');
        System.out.println("Karakterler sete eklendikten sonra = " + characterSet);
    }
    private static void karakterleriSeteEkle(Set<Character> characterSet, Character ... chars) {
        for (int i = 0; i < chars.length; i++) {
            characterSet.add(chars[i]);
        }
    }
    private static void arrayListdenSeteDonustur(ArrayList<Integer> arrlist, Set<Integer> set) {
        for (Integer each:arrlist) {
            set.add(each);
        }
    }
}
