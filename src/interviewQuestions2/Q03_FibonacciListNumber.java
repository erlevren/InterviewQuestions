package interviewQuestions2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_FibonacciListNumber {

    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {
        List<Integer> fibonacci = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz :");
        int sayi = scan.nextInt();
        fibonacci.add(0);
        fibonacci.add(1);

        int i=1;
        if(sayi<=1){
            System.out.println("Daha buyuk tamsayi giriniz ... ");
        }else{
            while(fibonacci.get(i)< sayi){ //fibonacci elemanlari, sayidan kucuk oldugu surece,
                fibonacci.add(fibonacci.get(i) + fibonacci.get(i-1)); //bir onceki eleman ile topla
                i++;
            }
            if(fibonacci.get(fibonacci.size()-1)>sayi) { //fibonaccideki son eleman, sayidan buyukse
                fibonacci.remove(fibonacci.size()-1); //bu elemani kaldir
                System.out.println("Girdiginiz sayi fibonacci dizisinde bulunmamaktadir ." +
                        "\n Girilen sayiya kadar fibonacci dizisi : " + fibonacci);
            }else
                System.out.println("Girdiginiz sayi fibonacci dizisinde bulunmaktadir..:" + fibonacci);

        }
    }

}
