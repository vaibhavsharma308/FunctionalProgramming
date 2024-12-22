import java.util.Arrays;
import java.util.List;

public class FP03 {
    public static void main(String[] args) {

        System.out.println("Map function in functional programming");
//        now we don't want to filter we want to perform some operation on top of it
        //map each element with some element
        //using mapper lambda function

        System.out.println("Square every number in a list and find the sum of squares");
        List<Integer> myList = Arrays.asList(1,2,3,5,6,3,2,5,13,3,2,2,4);
        myList.stream()
                .map(n->n*n)
                .forEach(System.out::println);
        System.out.println("Square of even number");
        myList.stream()
                .map(n->n*n)
                .filter(n->n%2==0)
                .forEach(System.out::println);

        System.out.println("Cube every number in a list and find the sum of cubes");
        myList.stream().filter(n->n%2==1).
                map(n->Math.pow(n,3)).forEach(System.out::println);


        System.out.println("Print the number of characters in each course name");
        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        courses.stream()
                .map(course->course+" "+course.length()).forEach(System.out::println);
    }


}
