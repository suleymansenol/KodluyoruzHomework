
import java.util.Scanner;

public class BurcBulmaProgrami {
    public static void main(String[] args) {
        int month, day;
        String burc= " " ;
        Scanner input = new Scanner(System.in);
        boolean isError=false;

        System.out.print("Doğum ayınızı sayısal olarak yazınız:");
        month=input.nextInt();

        System.out.print("Doğum gününüzü sayısal olarak yazınız");
        day=input.nextInt();

        switch (month){
            case 1:
                if ((day>=1) && (day<=31)){
                    if (day<=21){
                        burc ="oğlak";
                    }else{
                        burc="kova";
                    }
                }else{
                    isError=true;
                }
                break;
            case 2:
                if ((day>=1) && (day<=31)){
                    if (day<=19){
                        burc ="kova";
                    }else{
                        burc="balık";
                    }
                }else{
                    isError=true;
                }
                break;
            case 3:
                if ((day>=1) && (day<=31)){
                    if (day<=20){
                        burc ="balık";
                    }else{
                        burc="koç";
                    }
                }else{
                    isError=true;
                }
                break;
            case 4:
                if ((day>=20) && (day<=31)){
                    if (day<=20){
                        burc ="koç";
                    }else{
                        burc="boğa";
                    }
                }else{
                    isError=true;
                }
                break;
            case 5:
                if ((day>=1) && (day<=31)){
                    if (day<=21){
                        burc ="boğa";
                    }else{
                        burc="ikizler";
                    }
                }else{
                    isError=true;
                }
                break;
            case 6:
                if ((day>=1) && (day<=31)){
                    if (day<=22){
                        burc ="ikizler";
                    }else{
                        burc="yengeç";
                    }
                }else{
                    isError=true;
                }
                break;
            case 7:
                if ((day>=1) && (day<=31)){
                    if (day<=22){
                        burc ="yengeç";
                    }else{
                        burc="aslan";
                    }
                }else{
                    isError=true;
                }
                break;
            case 8:
                if ((day>=1) && (day<=31)){
                    if (day<=22){
                        burc ="aslan";
                    }else{
                        burc="başak";
                    }
                }else{
                    isError=true;
                }
                break;
            case 9:
                if ((day>=1) && (day<=31)){
                    if (day<=22){
                        burc ="başak";
                    }else{
                        burc="terazi";
                    }
                }else{
                    isError=true;
                }
                break;
            case 10:
                if ((day>=1) && (day<=31)){
                    if (day<=22){
                        burc ="terazi";
                    }else{
                        burc="akrep";
                    }
                }else{
                    isError=true;
                }
                break;
            case 11:
                if ((day>=1) && (day<=31)){
                    if (day<=21){
                        burc ="akrep";
                    }else{
                        burc="yay";
                    }
                }else{
                    isError=true;
                }
                break;
            case 12:
                if ((day>=1) && (day<=31)){
                    if (day<=21){
                        burc ="yay";
                    }else{
                        burc="oğlak";
                    }
                }else{
                    isError=true;
                }
                break;
            default:isError=true;






        }if (isError){
            System.out.println("Geçersiz gün bilgisi girdiniz,lütfen tekrar deneyiniz.");

        }else {
            System.out.println("Burcunuz:"+ burc);

    }
}}
