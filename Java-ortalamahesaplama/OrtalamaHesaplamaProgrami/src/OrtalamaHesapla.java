import java.util.Scanner;
public class OrtalamaHesapla {
    public static void main(String[] args) {
        int matematik, fizik, kimya ,turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz");
        matematik = input.nextInt();

        System.out.print("fizik notunuzu giriniz");
        fizik = input.nextInt();

        System.out.print("kimya notunuzu giriniz");
        kimya = input.nextInt();

        System.out.print("turkce notunuzu giriniz");
        turkce = input.nextInt();

        System.out.print("tarih notunuzu giriniz");
        tarih = input.nextInt();

        System.out.print("muzik notunuzu giriniz");
        muzik = input.nextInt();

        int toplam = (matematik+kimya+fizik+tarih+turkce+muzik);
        double ortalama = toplam/6.0;
        System.out.println("Ortalamanız:"+ortalama);
        boolean gecmesarti = ortalama > 60;
        String sonuc =gecmesarti?"Gecti":"Kaldi";
        System.out.println(sonuc);


    }
}

