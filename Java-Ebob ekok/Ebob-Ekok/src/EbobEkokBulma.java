import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {
      int snum,bnum,ebob,ekok;
        Scanner input= new Scanner(System.in);
        System.out.println("Küçük sayıyı giriniz");
        snum=input.nextInt();

        System.out.println("Büyük sayıyı giriniz");
        bnum=input.nextInt();

        for( int i =snum;i >= 1;i--){


            if ((snum % i == 0) && (bnum % i == 0)) {


                ebob = i;
                System.out.println("Ebob=" + ebob);
                break;
            }

        }
        

        for ( int k =bnum; k<= snum*bnum;k++){
        if ( k%snum==0 && k%bnum==0){

            System.out.println("Ekok="+k);
            break;
        }

            System.out.println("k:"+k);

    }





    }}
