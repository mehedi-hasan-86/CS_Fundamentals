interface Greeting{
    void sayHello();
}

public class Main21 {
    public static void main(String[] args) {
        Greeting greet = new Greeting() {
            public void sayHello(){
                System.out.println("Hello, World");
            }
        };
        greet.sayHello();
    }
    
}
