public class Greeter{
  public static void greet(Greeting greeting){
    greeting.perform();
  }
  public static void main(String[] args) {
    Greeter g = new Greeter();
    HelloGreet hello = new HelloGreet();
    g.greet(hello);
  }
}