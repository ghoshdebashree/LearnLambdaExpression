public class TypeInferenceExample{
  public static void main(String[] args) {
    StringLengthLambda myLambda = s -> s.length();
    System.out.println(myLambda.getStringLength("Hello Lambda"));
  }
}
interface StringLengthLambda{
  int getStringLength(String s);
}