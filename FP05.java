import java.util.Arrays;
import java.util.List;
public class FP05 {

    public static void main(String[] args) {
        System.out.println("Sorted and distinct in streams");
        List<Integer> myList = Arrays.asList(1,2,1,1,1,1,12,2,2,2,2,3,4,5,6,7);
        myList.stream()
                .distinct()
                .forEach(System.out::println);

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        courses.stream()
                .sorted().forEach(System.out::println);
    }
}
