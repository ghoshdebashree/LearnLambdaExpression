public class MethodReference {
  public static void main(String[] args) {
    Thread t1 = new Thread(MethodReference::printmessage); // With method reference
    t1.start();
    Thread t2 = new Thread(() -> printmessage()); // With lambda expression
    t2.start();
  }
  public static void printmessage(){
    System.out.println("This is just a demo");
  }
}
