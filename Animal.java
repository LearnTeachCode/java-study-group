public class Animal{

  private String eat;
  private String species;
  
  public Animal(){
  
  }
  
  public Animal(String eat, String species){
    this.eat = eat;
    this.species = species;
  }
  
  public void setEat(String eat){
    this.eat = eat;
  }
  
  public String getEat(){
    return this.eat;
  }
  
  public void setSpecies(String species){
    this.species = species;
  }
  
  public String getSpecies(){
    return this.species;
  }
  
  public String toString(){
    return "This animal eats " + this.eat + " and is a " + this.species; 
  }
}