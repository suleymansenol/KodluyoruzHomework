import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int Num1,Num2,islem;
        Scanner input= new Scanner(System.in);

        System.out.print("ilk sayıyı giriniz:");
        Num1=input.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        Num2=input.nextInt();

        System.out.print("toplama için 1'i ,çıkarma için 2'yi ,çarpma için 3'ü,bölme için 4'ü tuşlayın  ");
        islem= input.nextInt();
        switch (islem){
            case 1:
                System.out.print("Sonuç:"+(Num1+Num2));
                break;
            case 2:
                System.out.print("Sonuç:"+(Num1-Num2));
                break;
            case 3:
                System.out.print("Sonuç:"+(Num1*Num2));
                break;
            case 4:
                    switch (Num2){
                        case 0:
                            System.out.println("Hata Sayı Sıfır İle Bölünemez");
                            break;

                        default:System.out.print("Sonuç:"+(Num1/Num2));}


        }


    }
}
