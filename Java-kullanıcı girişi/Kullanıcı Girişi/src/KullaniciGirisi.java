import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {

    String password,userName,newpassword;
    String cevap;



    Scanner input =new Scanner(System.in);


        System.out.print("kullanıcı adınızı giriniz:");
        userName=input.nextLine();

        System.out.print("Şifrenizi giriniz:");
        password=input.nextLine();




        if (userName.equals("patika") && password.equals("java123"))
        {

            System.out.println("Giriş Başarılı");

        }
        else {
            System.out.println("Giriş başarısız ,şifrenizi değiştirmek istiyorsanız evet yazınız? ");


        }


        cevap =input.nextLine();


        if (cevap.equals("evet")) {
            System.out.print("Yeni şifrenizi giriniz");

            newpassword = input.nextLine();
        }else{
            System.out.println("giriş başarısız olmuştur");
            newpassword="";
        }
        System.out.println(newpassword);

        if((!newpassword.equals(password)) && !(newpassword.equals("java123"))){
            System.out.println("şifre değiştirildi yeni şifre -> "+newpassword);

        }else{
            System.out.println("şifre değiştirelemedi !!! eski şifreyle aynı olamaz!! -> "+newpassword);

        }



        }}

