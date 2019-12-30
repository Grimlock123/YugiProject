import java.util.*;
public interface Basic{
  public String getName();
  public void setName(String name);
  public String getDescription();
  public void setDescription(String decription);
  public String getCardType();
  public void setCardType(String type);
  public String getColor();
  public void setColor(String color);
  public ArrayList getTags();
  public Boolean addTag(String tag);
  public Boolean removeTag(String tag);
}
