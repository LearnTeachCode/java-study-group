public class TestAnimal{

  public static void main(String[] args){
  
    Animal animal = new Animal("meat", "human");
    
    System.out.println(animal);
    
    Cat cat = new Cat("meeeooowwww");
    
    Animal a = new Cat("grrrr");
    
    System.out.println(a);
  }
}