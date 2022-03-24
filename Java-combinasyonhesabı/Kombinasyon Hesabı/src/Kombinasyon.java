import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n,r,f;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir n sayısı giriniz:");
        n=input.nextInt();

        System.out.println("Bir r sayısı giriniz");
        r=input.nextInt();
        f=(n-r);
        if ((n<=0)||(n<r)){
            System.out.println("HATALI SAYI GİRDİNİZ");

        }else{

            int totaln=1;
             for (int i=1;i<=n;i++){
            totaln=i*totaln;;
        }
            int totalr=1;
             for (int i=1;i<=r;i++){


             totalr= i*totalr;


            }

             int totalf=1;

             for (int i=1;i<=f;i++){
                totalf=i*totalf;

             }
            System.out.println( n +"'in"+r +"'li kombinasyon sayısı :" +(totaln)/((totalr)*(totalf)));

    }
}}
