import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
       double r , cevre, alan,pi=3.14;


        System.out.println("Yarıçap Ölçüsünü Giriniz");
        Scanner input= new  Scanner(System.in);
        r=input.nextDouble();
        cevre=2*pi*r;
        alan=pi*r*r;
        System.out.println("Çevre:"+cevre);
        System.out.println("Alan:"+alan);

    }
}
