import java.util.Scanner;
public class SicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz:");
        heat=input.nextInt();

        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz");}

        if ((heat>5) && (heat <15)){
            System.out.println("Sinemaya gidebilirsinz");}

        if ((heat>10) && (heat<25)){
            System.out.println("Piknik yapabilirsiniz");

        }else if(heat>25) {
            System.out.println("Yüzmeye gidebilirsiniz");
                }
    }
}
