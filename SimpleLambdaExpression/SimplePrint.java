public class SimplePrint {
  public static void main(String[] args) {
    
    //MyLambda inteface notation which is similar to the lambda signature 
    MyLambda printValue = () -> System.out.println("Hello World");
    printValue.foo();
    //Another way to use MyLambda interface 
    MyLambda innerClass = new MyLambda(){
      public void foo(){
        System.out.println("Hello from Inner Class");
      }
      };
      innerClass.foo();
  }
}
interface MyLambda{
  void foo();
}



