import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int a,b=0;

    Scanner input = new Scanner(System.in);

        System.out.println("Sorgulamak istediğiniz sayıyı giriniz");
        a=input.nextInt();

        for(int i=a-1;i>=1;i--){
            if (a%i==0) {
                b = b + i;


            }

    }
        if (b==a){
            System.out.println(a+"sayısı mükemmel sayıdır");
        }
        else{
            System.out.println(a+"sayısı mükemmel sayı değildir");
        }
}}
