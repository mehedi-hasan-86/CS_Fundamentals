public class Java_this_keywordsAgain {
  int x;  

  public Java_this_keywordsAgain(int x) {
    this.x = x; 
  }

  public static void main(String[] args) {
    Java_this_keywordsAgain myObj = new Java_this_keywordsAgain(5);
    System.out.println("Value of x = " + myObj.x);
  }
}