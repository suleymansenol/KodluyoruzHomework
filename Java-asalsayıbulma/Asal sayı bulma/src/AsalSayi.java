import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
       int  n, a, b;

       Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        n=input.nextInt();
        if (n==2) {
            System.out.println("2 sayısı asal sayıdır.");
        }else {
       for(int i =2;i<n;i++){
           if(n%i==0) {
               System.out.println(n + " Sayısı asal sayı değildir");
           }else{
                   System.out.println(n+" Sayısı asal sayıdır");
               }

            break;


       }
    }
}}
