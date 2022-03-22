import java.util.Scanner;
public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        double Mesafe,fiyat=0.1;
        int tip,yas;

        Scanner input = new Scanner(System.in);

        System.out.println("Yaşınzı giriniz");
        yas=input.nextInt();

        System.out.println("Bilet Tipinizi seçin"+"Gidiş dönüş için 1 , tek yön için 2 yazınız");
        tip= input.nextInt();

        System.out.println("Mesafeyi giriniz");
        Mesafe=input.nextDouble();


        switch (tip){

            case 1:
                if (yas<12){
                    System.out.println("ücret:"+(Mesafe*fiyat)*0.3);
                }
                else if ((yas>=12)&&(yas<=24)){
                    System.out.println("ücret:"+(Mesafe*fiyat)*0.7);
                }
                else if (yas>=65) {
                    System.out.println("ücret:" + (Mesafe * fiyat) * 0.5);
                }else
                    System.out.println("ücret:"+(Mesafe*fiyat)*0.2);
                break;

            case 2:
                if (yas<12){
                    System.out.println("ücret:"+(Mesafe*fiyat)*0.5);
                }
                else if ((yas>=12)&&(yas<=24)){
                    System.out.println("ücret:"+(Mesafe*fiyat)*0.9);
                }
                else if (yas>=65) {
                    System.out.println("ücret:" + (Mesafe * fiyat) * 0.7);
                }else
                    System.out.println("ücret:"+(Mesafe*fiyat));
                break;














        }














    }




















}
