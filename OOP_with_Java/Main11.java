
class Person {
    String name;

    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

class Student extends Person {
    int grade;

    void showGrade() {
        System.out.println(name + " is in grade " + grade);
    }
}


public class Main11 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Bob";   
        s.grade = 10;

        s.sayHello();     
        s.showGrade();  
    }
}
