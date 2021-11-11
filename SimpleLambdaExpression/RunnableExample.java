public class RunnableExample {
  public static void main(String[] args) {
    Thread thread = new Thread(new Runnable() {
      public void run(){
        System.out.println("Main thread is running");
      }
    });
    thread.run();
    Thread myLambdathread = new Thread(() -> System.out.println("Running thread with lambda"));
    myLambdathread.run();
  }
}
