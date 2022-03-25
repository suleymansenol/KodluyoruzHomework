
import java.util.Scanner;

public class UcgenCizdirme {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir n sayısı giriniz");
        n=input.nextInt();
        int i,k,j;
       for (i=1; i <=((n/2)+1); i++){
            for ( k = 1; k <= (n/2+1-i); k++){
                System.out.print(" ");
           }

            for ( j =1; j <= (2*i-1); j++){
               System.out.print("*");
          }
           System.out.println();

        }

}}


