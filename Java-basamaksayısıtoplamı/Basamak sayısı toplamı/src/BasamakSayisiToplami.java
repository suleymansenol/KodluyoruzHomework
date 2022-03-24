
import java.util.Scanner;

public class BasamakSayisiToplami {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        int n = input.nextInt();
        int rakam,toplam=0;


        while (n != 0) {
            rakam=(n%10);
            toplam=rakam+toplam;
            n=n/10;





        } System.out.println(toplam);







        }


         }


