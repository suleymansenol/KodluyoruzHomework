import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        double n,toplam=0.0;
        Scanner input =new Scanner(System.in);
        System.out.println("Bir n sayısı giriniz");
        n=input.nextDouble();

        for (double i=1;i<=n;i++) {
            toplam += (1 / i);
        }
        System.out.println(toplam);

    }
}
