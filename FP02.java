import java.util.Arrays;
import java.util.List;

public class FP02 {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,67,8,89);
        myList.stream().filter(number->number%2==0)
                .forEach(System.out::println);

          System.out.println("Print only Odd Number");
          myList.stream().filter(n->n%2==1).forEach(System.out::println);

        System.out.println("2.Print All Courses individually");
        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
                courses.stream().forEach(System.out::println);

        System.out.println("3.Print Courses Containing the word");
        courses.stream().filter(course->course.contains("Spring")).
                        forEach(System.out::println);
        System.out.println("4.Print Courses Whose Name has atleast 4 letters");
      courses.stream().filter(course->course.length()>=8).forEach(System.out::println);
    }

}
