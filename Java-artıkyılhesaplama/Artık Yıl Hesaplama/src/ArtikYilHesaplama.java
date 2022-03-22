import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.println("Sorgulamak istediğiniz yılı giriniz");
        yil = input.nextInt();
        if ((yil >= 100) && (yil % 100 == 0) && (yil % 400 == 0)) {
            System.out.println(yil + "Artık yıldır");
            if ((yil % 4 == 0)&&(yil%100!=0)) {
                System.out.println(yil + "Artık yıldır");
            }
        } else {
            System.out.println(yil + "Artık yıl değildir");


        }
    }
}
