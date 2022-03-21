import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut ,elma,domates, patlican, muz,toplam;
        double aprice=2.14,eprice=3.67,dprice=1.11,pprice=5,mprice=0.95;

        Scanner input =new Scanner(System.in);
         
        System.out.println("Armut Kg:");
        armut= input.nextDouble();

        System.out.println("Elma Kg:");
        elma= input.nextDouble();

        System.out.println("Domates Kg:");
        domates= input.nextDouble();

        System.out.println("Patlıcan Kg:");
        patlican= input.nextDouble();

        System.out.println("Muz Kg:");
        muz = input.nextDouble();

        toplam=aprice*armut+eprice*elma+dprice*domates+pprice*patlican+mprice*muz;
        System.out.println("Toplam ödemeniz gereken miktar"+toplam+"TL");
    }
}
