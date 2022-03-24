import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int a,b,i;
        double total=1;

        Scanner input= new Scanner(System.in);

        System.out.print("Üssünü almak istediğiniz sayıyı giriniz:");
        a=input.nextInt();

        System.out.print("Üssü giriniz ");
        b=input.nextInt();

        for (i=1;i<=b;i++){
            total*=a;


        }
        System.out.println("Sonuç:"+ total);





    }

}
