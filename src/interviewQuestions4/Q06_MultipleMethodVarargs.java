package interviewQuestions4;

public class Q06_MultipleMethodVarargs {
    /*
	Problem Tanımı :
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız
 */

    public static void main(String[] args) {
    ortalamaBul("ali", 55,60,71,82,75,69);
    ortalamaBul("ayse", 55,60,75,69);
    ortalamaBul("ahmet", 55,60,71);
    ortalamaBul("yusuf", 55,60,71,82,69);
    }


    public static void ortalamaBul(String isim, double ...notlar){
        double toplam = 0;
        for (double each:notlar) {
            toplam += each;
        }
        System.out.println(isim + "-> not ortalamasi :" + toplam/notlar.length );
    }

}
