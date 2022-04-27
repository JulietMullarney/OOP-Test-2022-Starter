public class Nematode {
  
  public enum Gender{
    m,
    f,
    h,
    n
  }
  private String name;
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  
  public int getLength(){
    return length;
  }

  public void setLength(int Length) {
    this.length = length;
  }
  public void getLimbs(){
    return limbs;
  }
  
  @Override
  public String toString(){
    return "Nematode []";
  }
}
public class nematodeVisualizer{

public void loadNematodes(){
  Table table = loadTable("data/nematode.csv", "header");
  for(TableRow r:table.rows())
  {
    Nematode s = new Nematode();
    nematodes.add(nemas);
  }
}

public void render(NematodeVisualizer pa){    //prints nematode names
  pa.textSize(60);
  pa.textAlign(PApplet.CENTER, PApplet.CENTER);
  pa.text(name, (pa.width / 2), (pa.height - (pa.norder*0.4f)) 
  
}

int length = NematodeArray.get(NemaChoice).length,
for(int i = 0, i < length, i++){
  noFill();
  strokeWeight(10);
  stroke(255);
   circle(300, 200 + (offset*(length-1)), 300, 200 + (offset*(length-1))+50);
     if   
}