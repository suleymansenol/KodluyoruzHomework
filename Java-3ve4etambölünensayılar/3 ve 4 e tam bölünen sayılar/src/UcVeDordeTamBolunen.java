import java.util.Scanner;


public class UcVeDordeTamBolunen {
    public static void main(String[] args) {




    Scanner input = new Scanner(System.in);
        int k;
        System.out.println("Bir k sayısı giriniz");
        k=input.nextInt();
   int i =0;
    do {

        i++;
        if((i%3==0)&&(i%4==0)) {
            System.out.print(i+",");



        }
    }while (i<k );

}}

