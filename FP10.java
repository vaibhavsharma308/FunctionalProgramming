import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FP10 {
    public static void main(String[] args) {
        System.out.println("Functional Programming ");
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> checkEven =(x)->x%2==0;
        Predicate<Integer>checkOdd=(x)->x%2!=0;
        Function<Integer,Integer> doubleMapper = (x)->x*2;
        Consumer<Integer> actionPrint =System.out::println;
        Supplier<Integer>supplyNumber =()->2;
        Supplier<Integer> generateRandomNumber =()->{
            return (Integer) (int)(Math.random()*10);
        };
        myList.stream()
                .filter(checkEven)
                .forEach(System.out::println);
        System.out.println("Odd Number");
        myList.stream()
                .filter(checkOdd)
                .forEach(actionPrint);
        List<Integer> doubleNumber = myList.stream().
                map(doubleMapper).collect(Collectors.toList());
        System.out.println(doubleNumber);
        System.out.println("Using Supplier "+ supplyNumber.get());
        System.out.println("Random Number "+ generateRandomNumber.get());
    }
}
