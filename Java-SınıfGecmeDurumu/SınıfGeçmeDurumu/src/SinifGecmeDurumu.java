
import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        int matort,fizort,turkort,kimort,muzort,derssayisi=0;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz");
        mat=input.nextInt();

        System.out.println("Fizik notunuzu giriniz");
        fizik=input.nextInt();

        System.out.println("Türkçe notunuzu giriniz");
        turkce=input.nextInt();

        System.out.println("Kimya notunuzu giriniz");
        kimya=input.nextInt();

        System.out.println("Müzik notunuzu giriniz");
        muzik=input.nextInt();

        if ((mat<100) && (mat>0)) {
            derssayisi =(derssayisi+1);
            matort = mat;
        }
        else {
            matort = 0;
            derssayisi = derssayisi;
        }

        if ((fizik<100) && (fizik>0)) {
            derssayisi =(derssayisi+1);
           fizort = fizik;
        }
        else {
            fizort = 0;
            derssayisi = derssayisi;
        }

        if ((turkce<100) && (turkce>0)) {
            derssayisi =derssayisi+1;
            turkort =turkce;
        }
        else {
            turkort = 0;
            derssayisi = derssayisi;
        }
        if ((kimya<100) && (kimya>0)) {
            derssayisi =(derssayisi+1);
            kimort = kimya;
        }
        else {
            kimort = 0;
            derssayisi = derssayisi;
        }
        if ((muzik<100) && (muzik>0)) {
            derssayisi =(derssayisi+1);
            muzort = muzik;
        }
        else {
            muzort = 0;
            derssayisi = derssayisi;
        }
      ortalama=(matort+fizort+turkort+kimort+muzort)/derssayisi;
        System.out.println(ortalama);




    }
}
