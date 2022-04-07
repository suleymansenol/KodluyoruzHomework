public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int turn;


    Fighter(String name,int damage,int health,int weight,int dodge,int turn){
        this.name= name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
      if (dodge>=0 && dodge<=100){
          this.dodge=dodge;
          this.turn=turn;

      }else{
          this.dodge=0;
      }
    }
    int hit(Fighter foe){

        System.out.println(this.name+"=>"+foe.name+" "+this.damage+ " hasar verdi");
        if (foe.isDodge()){
            System.out.println(foe.name+" Gelen hasarı blokladı");
            return foe.health;
        }
        if (foe.health-this.damage<0){
            return 0;
        }

        return foe.health-this.damage;
    }

boolean isDodge(){
        double randomnumber=Math.random()*100;
        return randomnumber<=this.dodge;
}
boolean isTurn(){
        double randomturn=Math.random()*100;
        return randomturn<=this.turn;
}



}
