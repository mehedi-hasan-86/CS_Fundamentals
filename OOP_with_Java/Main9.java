class Person{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}

public class Main9 {
    public static void main(String[] args) {
        Person myObj = new Person();
        // myObj.name = "John"; -> error
        myObj.setName("Mehedi");
        System.out.println(myObj.getName());

    }
    

}
