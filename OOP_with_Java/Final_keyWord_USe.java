public class Final_keyWord_USe {

    final int x = 10;

    public static void main(String[] args) {
        Final_keyWord_USe myObj = new Final_keyWord_USe();
         //myObj.x = 25 // Will generate an error : cannot assign a value to final variable

         System.out.println(myObj.x);
    }
    
}
