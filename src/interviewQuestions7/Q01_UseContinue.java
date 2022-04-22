package interviewQuestions7;

import java.util.Scanner;

public class Q01_UseContinue {

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir string giriniz :");
        String ifade = scan.nextLine();

        for(int i = 0; i <ifade.length(); i++){//ifadenin karakterlerine bakar
            if (ifade.charAt(i) == 'a'  ||  ifade.charAt(i) == ' ') //ifade de a yada bosluk icerirse
                continue;   // bu satir calistiginda dongunun basina gider,
                            // cunku a veya bosluk var iken herhangi bir ciktisini istemiyor
                            // break aklilniza gelebilir.. ancak break kodu tamamen kirar ve devam etmez..
            System.out.println(ifade.charAt(i));
        }
    }

}
