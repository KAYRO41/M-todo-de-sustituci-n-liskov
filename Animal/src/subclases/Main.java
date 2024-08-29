package subclases;

public class Main {
  
    public static void someMethod(Animal animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {
        Animal myDog = new perro();
        Animal myCat = new Gato();
        Animal myBird = new Ave();
        Animal myFish = new pez();
        Animal myLion = new Leon();

      
        someMethod(myDog);  
        someMethod(myCat);  
        someMethod(myBird); 
        someMethod(myFish);
        someMethod(myLion); 
}
}