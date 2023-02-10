// A zookeeper has asked for your help creating a way for her 
// to track her animals' energy levels. In particular, she is 
// having difficulty tracking the mammals. Every mammal should
// have an energy level (default 200). They should all be able 
// to display their energy levels when asked through the displayEnergy
// method, which should print and return the energy level.

public class Animal{
  protected int energyLevel = 200;

  public Animal(){}
  public Animal(int energyLevel){
    this.energyLevel = energyLevel;
  }
  public int displayEnergy(){
    System.out.println("Energy level now: "+ energyLevel);
    return energyLevel;
  }

// setters and getters 

  public int getEnergyLevel() {
    return this.energyLevel;
  }

  public void setEnergyLevel(int energyLevel) {
    this.energyLevel = energyLevel;
  }
}