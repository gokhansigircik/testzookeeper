public class Zebra extends Animal {
  public Zebra(){
    super(500);
    
  }
  public void run(){
    System.out.println("running for his life");
    energyLevel -=200;
    displayEnergy();
  }
  public void eatGrass(){
    System.out.println("Eating fresh grass");
    energyLevel +=100;
    displayEnergy();
  }
}
