public class Closures {
  public static void main(String[] args) {
    int a = 10;
    int b = 20; 
    System.out.println("*********Without Lambda*******");
    doProcess(a, new Process(){
      public void process(int i){
        System.out.println(i + b); // works considering b  as final
      }
    });
    System.out.println("**********With Lambda*********");
    doProcess(a, i -> System.out.println( i + b));

  }
  public static void doProcess(int i, Process p){
    p.process(i);
  }
}

interface Process{
  void process(int i);
}
