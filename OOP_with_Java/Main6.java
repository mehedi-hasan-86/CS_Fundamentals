public class Main6 {
    int x;
    int modelYear;
    String modelName;

    public Main6(String modelName){
        this(2020, modelName);
    }

    public Main6(int modelYear, String modelName){
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public void printInfo(){
        System.out.println(modelYear + " " + modelName);
    }

    public Main6(int x){
        this.x = x;
    }
    

    public static void main(String[] args) {
        Main6 myObj = new Main6(5);
        System.out.println(myObj.x);

        Main6 car1 = new Main6("Corvette");
        Main6 car2 = new Main6(1969, "Mustang");

        car1.printInfo();
        car2.printInfo();
    }
    
}
