import java.util.Scanner;

public class RecursiveAsalSayi {
    static int mod(int a) {
        int result = 1;
        for (int i = 2; i < a; i++) {
            result = a % i;
            if (result == 0) {
                System.out.println(a + "Sayısı asal sayı değildir");


            } else System.out.println(a + "Sayısı asal sayıdır");
break;
        }
        return result;
    }

        public static void main(String [] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Sorgulamak istediğiniz sayıyı giriniz : ");
            int a = scan.nextInt();
            if (a == 2) {
                System.out.println(a + "Sayısı asal sayıdır");
            }
            mod(a);

        }}
