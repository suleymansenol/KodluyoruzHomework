import java.util.Scanner;
public class UsluSayiRecursive {
static int us(int a,int b){
    int result =1;
for(int i=1;i<=b;i++) {
    result *= a;
}
return result;
}
 public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
     System.out.println("Taban sayıyı giriniz");
     int a=scan.nextInt();
     System.out.println("üssü giriniz :");
    int  b=scan.nextInt();
     System.out.println("Us sonucu :"+(us(a,b)));

}
}

