import java.util.Arrays;
import java.util.List;

public class ForEachForIn {
  public static void main(String[] args) {
    List<Person> people = Arrays.asList(
      new Person("Debashree", "Ghosh", 35),
      new Person("Shree", "Ghosh", 36),
      new Person("Jon", "Snow", 32),
      new Person("Arya", "Stark", 21)
    );
    System.out.println("*******Printing with For in Loop *****");
    for(Person p : people){
      System.out.println(p);
    }
    System.out.println("*******Printing with For Each *********");
    people.forEach(System.out::println);
  }
  
}
