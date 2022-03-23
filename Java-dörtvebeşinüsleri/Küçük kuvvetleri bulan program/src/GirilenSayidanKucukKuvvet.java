import java.util.Scanner;

public class GirilenSayidanKucukKuvvet {
    public static void main(String[] args) {
        int n,i;
        Scanner input= new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        n=input.nextInt();

        for ( i=1; i<n;i*=5) {
            System.out.println("5'in katları: " + i);
        }
        for ( i=1; i<n;i*=4){
            System.out.println("4'ün katları: " + i);
        }
             }











    }


