

/* Functional Interface
  this basically contain only one abstract method we have
*/

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

@FunctionalInterface
interface A{
    public void show();
}
@FunctionalInterface
interface B{
    public void BFunction();
}
public class FP08 {

    public static void main(String[] args) {
        A objectA = new A(){
            public void show(){
                //Anonymous Inner Class
                System.out.println("Hey functional Programming");
            }
        };
        objectA.show();
        B objectB = ()->{
            System.out.println("Inside B Functional Interface");
        };
        objectB.BFunction();
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        nums.stream()
                .filter(getIntegerPredicate()).forEach(System.out::println);
        System.out.println("Odd Number");
        nums.stream()
                .filter(x->x%2!=0).forEach(System.out::println);

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        courses.stream()
                .sorted().map(course->course.toUpperCase(Locale.ROOT)).forEach(System.out::println);

    }

    private static Predicate<Integer> getIntegerPredicate() {
        return x -> x % 2 == 0;
    }
}
