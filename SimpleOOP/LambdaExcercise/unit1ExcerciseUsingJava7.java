import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class unit1ExcerciseUsingJava7 {
  public static void main(String[] args) {
    List<Person> persons = Arrays.asList(
                                new Person("Debashree","Ghosh",35),
                                new Person("Chandan", "Kumar", 29),
                                new Person("Shriyan", "De", 5)
    ); 
    // Sort list by last name
    Collections.sort(persons, new Comparator<Person>(){
      public int compare(Person p1, Person p2){
        return p1.getFirstName().compareTo(p2.getFirstName());
      }
    });
    System.out.println("Printing the persons");
    printAll(persons);
    System.out.println("************************");
    printNameBeginningWithS(persons);
    System.out.println("************************");
    printNameEndsWithR(persons);
  }
  //Print persons with staring name staring with "S"
  private static void printNameBeginningWithS(List<Person> persons){
    for(Person p : persons){
      if(p.getFirstName().startsWith("S")){
        System.out.println(p);
      }
    }
  }
  //Print persons name with ending character R
  private static void printNameEndsWithR(List<Person> persons){
    for(Person p : persons){
      if(p.getLastName().endsWith("r")){
        System.out.println(p);
      }
    }
  }
  //Print all the persons
  private static void printAll(List<Person> persons){
    for(Person p : persons){
      System.out.println(p);
    }
  }
}
