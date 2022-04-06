public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String Classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String Classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.Classes=Classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;


    }
    void addbulkexamnote (int note1, int note2,int note3){

       if (note1>=0 && note1<=100 ){
        this.c1.note=note1;}
       if (note2>=0 && note2 <=100){
        this.c2.note=note2;}
       if (note3>=0 && note3<=100){
       this.c3.note=note3;}
    }
    void ispass(){
        this.avarage=((this.c1.note+this.c2.note+this.c3.note)/3.0);
        if (this.avarage>55){
            System.out.println("SINIFI GEÇTİNİZ");
            this.isPass=true;
        }else System.out.println("SINIFTA KALDINIZ");
        printnote();
        this.isPass=false;
    }



    void  printnote(){
        System.out.println("==================");
        System.out.println(c1.name+"Notu"+this.c1.note);
        System.out.println(c2.name+"Notu"+this.c2.note);
        System.out.println(c3.name+"Notu"+this.c3.note);
        System.out.println("Ortalamanız"+this.avarage);
    }





}
