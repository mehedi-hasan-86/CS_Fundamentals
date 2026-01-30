class Animal{
    public void makeSound(){
        System.out.println("Animal sound");
    }
}

public class Main20 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(){
            public void makeSound(){
                System.out.println("Woof woof");
            }
        };
        myAnimal.makeSound();
    }
    
}
