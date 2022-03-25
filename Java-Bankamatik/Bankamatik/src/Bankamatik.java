import java.util.Scanner;

public class Bankamatik {
    public static void main(String[] args) {
        String password="", UserName="";
        int right=3,select,bakiye=3000,c,y;

        Scanner input= new Scanner(System.in);
        while (right>0) {
            System.out.println("Kullanıcı Adınızı Giriniz:");
            UserName = input.nextLine();

            System.out.println("Şifrenizi giriniz:");
            password = input.nextLine();


            if ((UserName.equals("patika")) && (password.equals("dev123"))) {
                System.out.println("HOŞ GELDİNİZ");
                do {
                System.out.print("Yapmak istediğiniz işlemi seçiniz " +
                        "\nPara çekmek için 1" +
                        "\n Para yatırmak için 2" +
                        "\n Bakiyenizi öğrenmek için 3" +
                        "\nÇıkış yapmak için 4 ü tuşlayınız");
                select = input.nextInt();


                switch (select) {

                    case 1:
                        System.out.println("Çekmek istediğiniz miktarı yazınız:");
                        c = input.nextInt();
                        bakiye = bakiye - c;
                        break;
                    case 2:
                        System.out.println("Yatırmak istediğiniz miktarı yazınız:");
                        y = input.nextInt();
                        bakiye = bakiye + y;
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: " + bakiye);
                        break;
                    case 4:
                        System.out.println("Yine Bekleriz");
                        break;
                }}while (select!=4);
                break;
            } else {
                right--;
                System.out.println("Hatalı giriş yaptınız tekrar deneyiniz");

                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur,lütfen en yakın bankamızla iletişime geçiniz");


                } else {
                    System.out.println("Kalan hakkınız:" + right);


                }


            }

        }}}