public class Main {
  public static void main(String[] args) {
  Fighter f1= new Fighter("A",10,120,100,60,50);
  Fighter f2= new Fighter("B",20,85,85,40,70);

  Match match=new Match(f1,f2,84,105);
  match.run();
    }
}
