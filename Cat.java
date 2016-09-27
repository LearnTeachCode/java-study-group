public class Cat extends Animal{
  
  private String catCall;
  
  public Cat(){
  
  }
  
  public Cat(String catCall){
    this.catCall = catCall;
    super.setEat("Meow Mix");
    super.setSpecies("cat");
  }
  
  public void setCatCall(String catCall){
    this.catCall = catCall;
  }
  
  public String getCatCall(){
    return this.catCall;
  }
  
  public String toString(){
    //return super.toString() + " and purrs like " + this.catCall;
    return "This animal purrs like " + this.getCatCall();
  }
}