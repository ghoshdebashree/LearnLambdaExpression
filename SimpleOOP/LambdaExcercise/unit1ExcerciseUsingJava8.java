import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.*;

import java.util.List;public class unit1ExcerciseUsingJava8 {
  public static void main(String[] args) {
    List<Person> persons = Arrays.asList(
                                new Person("Debashree","Ghosh",35),
                                new Person("Chandan", "Kumar", 29),
                                new Person("Shriyan", "De", 5)
    ); 
    // Sort list by last name
    Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
    System.out.println("Printing the persons");
    persons.stream().forEach(System.out::println);

    System.out.println("PERSONS ********** STARTS WITH LETTER 'S' **************");
    persons.stream().filter(p -> p.getFirstName().startsWith("S")).collect(Collectors.toList()).forEach(System.out::println);
    
    System.out.println("PERSONS ******** ENDS WITH LETTER 'r' ****************");
    persons.stream().filter(p -> p.getLastName().endsWith("r")).collect(Collectors.toList()).forEach(System.out::println);

    System.out.println("********FIND THE PERSON WITH A PERTICULAR AGE ********");
    persons.stream().filter( p -> p.getAge() == 5).forEach(System.out::println);
  }
}


