import java.util.*;
public class Card extends absCard{
  private int atk;
  private int def;
  private int level;
  private String atttibute;
  private String monType;
  private Boolean pos =true;
  Card(String name,String type,String color,String description,int atk,int def,int level,String atttibute,String monType){
    super(name,type,color,description);
    this.atk=atk;
    this.def=def;
    this.level=level;
    this.atttibute=atttibute;
    this.monType=monType;
  }
  public int getATK(){
    return atk;
  }
  public void setATK(int atk){
    this.atk=atk;
  }
  public int getDEF(){
    return def;
  }
  public void setDEF(int def){
    this.def=def;
  }
  public int getLevel(){
    return level;
  }
  public void setLevel(int level){
    this.level=level;
  }
  public String getAtttibute(){
    return atttibute;
  }
  public void setAtttibute(String atttibute){
    this.atttibute=atttibute;
  }
  public String getMonType(){
    return monType;
  }
  public void setMonType(String monType){
    this.monType=monType;
  }
  public String toString(){
    return "Name: "+name+" Level: "+level+"\n"+
    "Attack: "+atk+" Defense: "+def+" Attribute: "+atttibute+"\n"
    +"Monster Type: "+monType;
  }
  public static void main(String[] args) {
    Card newCard=new Card("M","M","M","M",1,1,1,"M","M");
    System.out.println(newCard.toString());
  }
  //Card(String name,String type,String color,String description,int atk,int def,int level,String atttibute,String monType,Boolean pos)
}
