
import java.util.Scanner;

public class DeseneGöreMetot {


    static int desen(int a){

      int result=a;
        System.out.print(result+" ");
       while (result>0){

           result=result-5;
           System.out.print(result+" ");
       }
       while (result!=a){
           result=result+5;
           System.out.print(result+" ");
       }
       return result;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayı giriniz :");
        int a =scan.nextInt();
        desen(a);

    }



}
