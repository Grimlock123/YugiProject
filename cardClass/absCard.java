import java.util.*;
public abstract class absCard implements Basic{
  String name;
  String type;
  String color;
  String description;
  ArrayList<String> tags = new ArrayList<>();
  public String getName(){
    return name;
  }
  absCard(String name, String type, String color, String description){
    this.name=name;
    this.type=type;
    this.color=color;
    this.description=description;
  }
  public void setName(String name){
    this.name=name;
  }
  public String getCardType(){
    return type;
  }
  public void setCardType(String type){
    this.type=type;
  }
  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color=color;
  }
  public String getDescription(){
    return description;
  }
  public void setDescription(String description){
    this.description=description;
  }
  public Boolean addTag(String tag){
    return tags.add(tag);
  }
  public Boolean removeTag(String tag){
    return tags.remove(tag);
  }
  public ArrayList getTags(){
    return tags;
  }
}
