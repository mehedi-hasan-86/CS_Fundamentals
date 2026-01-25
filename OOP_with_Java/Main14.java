class Animal{
    String type = "Animal";
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }

    Animal(){
        System.out.println("Animal is created");
    }
}

class Dog extends Animal{
    String type = "Dog";
    public void animalSound(){
        super.animalSound();
        System.out.println("The dog says: bow wow");
        System.out.print(super.type);
    }

    Dog(){
        super();
        System.out.println("Dog is created");
    }
}

public class Main14 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalSound();
    }
    
}
