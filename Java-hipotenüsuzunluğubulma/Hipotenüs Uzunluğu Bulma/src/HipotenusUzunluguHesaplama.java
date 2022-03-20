



import java.util.Scanner;
public class HipotenusUzunluguHesaplama {
    public static void main(String[] args) {
       double ilkdikkenar, ikincidikkenar ,hipotenus;

        Scanner uzunluk= new Scanner(System.in);
        System.out.println("İlk dik kenar uzunluğunu giriniz");
        ilkdikkenar= uzunluk.nextDouble();

        System.out.println("İkinci dik kenar uzunluğunu giriniz");
        ikincidikkenar=uzunluk.nextDouble();

        hipotenus= Math.sqrt((ilkdikkenar*ilkdikkenar)+(ikincidikkenar*ikincidikkenar));
        System.out.println("Hipotenüs Uzunluğu:"+hipotenus);
    }

}
