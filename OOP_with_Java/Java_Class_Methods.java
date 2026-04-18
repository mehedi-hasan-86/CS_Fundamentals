public class Java_Class_Methods {

    // Static Method
    static void myMethod(){
        System.out.println("Hello World");
    }

    // default method
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    // paramter method
    public void speed(int maxSpeed){
        System.out.println("Max speed is : "+ maxSpeed);
    }



    public static void main(String[] args) {
        myMethod();

        Java_Class_Methods myCar = new Java_Class_Methods();
        myCar.fullThrottle();
        myCar.speed(200);


    }
}
