public class Java_this_keywords{
    int x;
    String name;

    public Java_this_keywords(int x){
        this(x, "Mehedi");
    }
    public Java_this_keywords(int x, String name){
        this.x = x;
        this.name = name;
    }
    public void printInfo(){
        System.out.println(x + " " + name);
    }
    public static void main(String[] args) {
        Java_this_keywords myObj = new Java_this_keywords(5);
        Java_this_keywords myObj2 = new Java_this_keywords(20, "Mehedi");

        myObj.printInfo();
        myObj2.printInfo();
    }
}