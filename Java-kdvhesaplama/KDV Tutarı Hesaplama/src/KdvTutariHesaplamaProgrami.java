import java.util.Scanner;
public class KdvTutariHesaplamaProgrami

{
    public static void main(String[] args) {
    float fiyat, kdv=0.18f,kdvlifiyat;
     Scanner input = new Scanner(System.in);
        System.out.println("Ürün fiyatını giriniz:");
     fiyat= input.nextFloat();
     kdvlifiyat= fiyat*kdv+fiyat;
        System.out.println("Toplam Fiyat:"+kdvlifiyat);
    }
}
