public class monsterCard extends Card{
  //explicitly define color
  monsterCard(String name,String type,String color,String description,int atk,
    int def,int level,String atttibute,String monType){
      super(name,type,color,description,atk,def,level,atttibute,monType);
  }
  public int monAttack(monsterCard mon){
    int difference =this.atk-mon.getATK();
    return difference;
  }
  //to implement in a later date
  //public int monDirATK();
}
