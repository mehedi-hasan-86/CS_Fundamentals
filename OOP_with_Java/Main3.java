public class Main3 {
    static void myMethod(){
        System.out.println("Hello Wold!");
    }

    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed){
         System.out.println("Max speed is: "+ maxSpeed);
    }

    public static void main(String [] args){
        myMethod();

        Main3 myCar = new Main3();
        myCar.fullThrottle();
        myCar.speed(200);
    }


    
}
