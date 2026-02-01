import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        String name = myObj.nextLine();

        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
    
}
