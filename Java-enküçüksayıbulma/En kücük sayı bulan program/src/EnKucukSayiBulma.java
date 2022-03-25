import java.util.Scanner;

public class EnKucukSayiBulma {
    public static void main(String[] args) {
    int n,a,b;
    Scanner input=new Scanner(System.in);
        System.out.println("Kaç tane sayı girmek istiyorsunuz?");
        n=input.nextInt();
        System.out.println("ilk sayıyı giriniz");
        b=input.nextInt();

        for(int i=1;i<=n-1;i++){
            System.out.println("Diğer Sayıları giriniz");
            a=input.nextInt();
            if (a<b){
                b=a;

            }

            }System.out.println("En küçük sayı"+b);




    }
        }














