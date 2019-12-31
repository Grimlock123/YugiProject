public class fusionMon extends monsterCard{
  private int levelReq;
  private ArrayList<Card> monReq;
  private ArrayList<Card> monTypeReq;
  //0=fire, 1=water, 2=earth, 3=air
  private Boolean elementReq[] = new Boolean[4];

  fusionMon(String name,String type,String color,String description,int atk,
    int def,int level,String atttibute,String monType){
      super(name,type,color,description,atk,def,level,atttibute,monType);
  }

  public int getLevelReq(){
    if(levelReq="")return 0;
    else{return levelReq;}
  }

  public void setLevelReq(int levelReq){
    this.levelReq=levelReq;
  }
//break point complete later
  public ArrayList<Card> getMonReq(){
    if(monReq.size=0)return 0;
    else{return levelReq;}
  }

  public void setLevelReq(int levelReq){
    ithis.levelReq=levelReq;
  }
}
