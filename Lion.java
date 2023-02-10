public class Lion extends Animal{
  public Lion(){
    super();
  }
  public void run(){
    System.out.println("Lios is running");
    energyLevel -=50;
    displayEnergy();
  }
  public void eatMeat(){
    System.out.println("Lion is eating a Zebra");
    energyLevel +=100;
    displayEnergy();
  }
  public void drinkWater(){
    System.out.println("Lion is feeling better");
    energyLevel +=50;
    displayEnergy();
    }
}
