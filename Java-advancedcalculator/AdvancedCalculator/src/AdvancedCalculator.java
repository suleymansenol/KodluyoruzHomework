import java.util.Scanner;

public class AdvancedCalculator {
    static int sum(int a ,int b){
        int result=a+b;
        System.out.println("Toplam"+result);
        return result;
    }
    static int minus(int a,int b){
        int result=a-b;
        System.out.println("Çıkarma"+result);
        return result;
    }
    static int carp(int a,int b){
        int result =a*b;
        System.out.println("Çarpma"+result);
        return result;
    }
    static int bolme(int a,int b) {
        if (b == 0) {
            System.out.println("2. sayı sıfırdan farklı olmalı");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm :" + result);
        return result;
        }
    static int usalma(int a,int b){
        int result=1;
        for (int i =1;i<=b;i++){
            result*=a;
        }
        return result;
    }
    static int mod(int a,int b){
        return a%b;


    }
    static void calc(int a,int b){
        System.out.println("Çevre: "+(2*(a+b)));
        System.out.println("Alan: "+(a*b));
    }

    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int select;
        String menu ="1- Toplama işlemi\n" +
                "2- Çıkarma işlemi\n" +
                "3-Çarpma işlemi\n" +
                "4-Bölme işlemi\n" +
                "5-Üslü sayı işlem\n" +
                "6-Mod alma\n" +
                "7-Dikdörtgen alan ve çevre\n" +
                "0-Çıkış yap";
    while (true){
        System.out.println(menu);
        System.out.println("Bir işlem seçiniz");
        select=scan.nextInt();
        if(select==0){
            break;
        }
        System.out.println("İlk sayı :");
        int a=scan.nextInt();
        System.out.println("İkinci sayı :");
        int b=scan.nextInt();
        switch (select){
            case 1:
                sum(a,b);
                break;
            case 2:
                minus(a,b);
                break;
            case 3:
                carp(a,b);
                break;
            case 4:
                bolme(a,b);
                break;
            case 5:
                System.out.println("üslü sayı sonucu:" + usalma(a,b));
                break;
            case 6:
                System.out.println("Mod"+mod(a,b));
                break;
            case 7:
                calc(a,b);
                break;
            default:
                System.out.println("Geçirsiz bir işlem girdiniz");





        }


    }




    }
}
