import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP06 {

    public static void main(String[] args) {
        System.out.println("Collect in streams basically use to store the result to one collection " );
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,67,8,89);
        List<Integer> doubleList = myList.stream()
                .map(num->num*2).collect(Collectors.toList());
        System.out.println(myList);
        System.out.println(doubleList);

        System.out.println("Print the number of characters in each course name");
        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

        List<String> outputList = courses.stream()
                .map(course -> course + " " + course.length())  // Use length() method
                .collect(Collectors.toList());

        System.out.println(outputList);

    }
}
