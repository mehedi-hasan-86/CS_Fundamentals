public class Java_Constructors {

    int x;
    public Java_Constructors(){
       x=5;
    }

    public Java_Constructors(int y){
        x  = y;
    }

    public static void main(String[] args) {
        Java_Constructors myObj = new Java_Constructors();
        System.out.println(myObj.x);

        Java_Constructors myObj1 = new Java_Constructors(10);
        System.out.println(myObj1.x);
    }
    
}
