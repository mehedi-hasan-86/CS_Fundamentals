enum Level{
    LOW,
    MEDIUM,
    HIGH
}

public class Main24 {
    public static void main(String[] args) {
        for(Level myVar : Level.values()){
            System.out.println(myVar);
        }
        Level myVar = Level.MEDIUM;

        // switch(myVar){
        //     case LOW:
        //         System.out.println("Low Level");
        //         break;
        //     case MEDIUM:
        //         System.out.println("Medium level");
        //         break;
        //     case HIGH:
        //         System.out.println("High Level");
        //         break;
        // }
    }
    
}
