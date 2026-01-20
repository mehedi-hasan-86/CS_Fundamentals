public class Main5 {
    int x ;

    public Main5(int y){
        x = y;
    }
    int modelYear;
    String modelName;

    public Main5(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Main5 myObj = new Main5(5);
        System.out.println(myObj.x);

        Main5 myCar = new Main5(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);

    }
    
}
