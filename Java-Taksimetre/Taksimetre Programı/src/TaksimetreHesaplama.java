import java.util.Scanner;
public class TaksimetreHesaplama {
    public static void main(String[] args) {
        double km=2.20 , fiyatkısa,fiyatuzun;
    Scanner kilometre=new Scanner(System.in);
        System.out.println("Kilometre bilgisini giriniz:");
        km=kilometre.nextDouble();
        fiyatkısa=20;
        fiyatuzun=10+2.20*km;
        boolean tarife=km<4.545454;
         double ucret=tarife?fiyatkısa:fiyatuzun;
        System.out.println("Toplam Tutar:"+ucret);


    }
}
