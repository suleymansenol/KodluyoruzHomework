public class Main {
    public static void main(String[] args){

        Teacher t1= new Teacher("Mahmut hoca","TRH","0515454");
        Teacher t2= new Teacher("graham bell","FZK","5654646");
        Teacher t3= new Teacher("Külyutmaz","BIO","56544564");

        Course tarih= new Course("Tarih","101","TRH");
        tarih.AddTeacher(t1);

        Course fizik =new Course("Fizik","202","FZK");
        fizik.AddTeacher(t2);

        Course biyo=new Course("Biyoloji","206","BIO");
        biyo.AddTeacher(t3);



        Student s1=new Student("İnek şaban","1126","4",tarih,fizik,biyo);
        s1.addbulkexamnote(100,75,83);
        s1.ispass();
        Student s2=new Student("Şevket","448","3",tarih,fizik,biyo);
        s2.addbulkexamnote(78,89,92);
        s2.ispass();

        }




    }

