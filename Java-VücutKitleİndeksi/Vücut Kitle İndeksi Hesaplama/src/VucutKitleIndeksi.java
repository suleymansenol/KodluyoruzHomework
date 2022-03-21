import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double Boy,Kilo,Vki;

        System.out.print("Boyunuzu metre cinsinden giriniz:");
        Scanner input =new Scanner(System.in);
        Boy=input.nextDouble();

        System.out.print("Kilonuzu giriniz:");
        Kilo= input.nextDouble();
        Vki=Kilo/(Boy*Boy);

        System.out.println(Vki);
    }
}
