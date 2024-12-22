 import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//
//Predicate and
public class FP07 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        BinaryOperator<Integer> binaryOperation  = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };
        int ans= numbers.stream()
                .reduce(0,binaryOperation);
        System.out.println("Sum will be : "+ans);
        List<Integer> twoTable = numbers.stream()
                .map(each->each*2).
                collect(Collectors.toList());
        System.out.println(twoTable);
        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        List<String> outputList = courses.stream()
                .map(course -> course + " " + course.length())  // Use length() method
                .collect(Collectors.toList());
        courses.stream()
                        .filter(course-> course.contains("oo")).forEach(System.out::println);
        System.out.println(outputList);
        Predicate<Integer> checkEven = n->n%2==0;
        numbers.stream().filter(checkEven).forEach(System.out::print);
    }
}
/*       Stream<T> filter(Predicate<? super T> predicate)
        <R> Stream<R> map(Function<? super T, ? extends R> mapper);
        void forEach(Consumer<? super T> action);

        Here we have predicate and consumer
 */